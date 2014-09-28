package com.haiyue.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.haiyue.pageModel.Json;
import com.haiyue.pageModel.Menu;
import com.haiyue.service.MenuServiceI;


@Controller
@RequestMapping("/menuController")
@Scope("prototype")
public class MenuController {

	private MenuServiceI menuService;

	public MenuServiceI getMenuService() {
		return menuService;
	}

	@Autowired
	public void setMenuService(MenuServiceI menuService) {
		this.menuService = menuService;
	}

	@RequestMapping("/allTreeNode")
	@ResponseBody
	public List<Menu> allTreeNode(Menu menu) {
		return menuService.treeNode(menu);
	}

	@RequestMapping("/treegrid")
	@ResponseBody
	public List<Menu> treegrid() {
		return menuService.treegrid();
	}

	@RequestMapping("/remove")
	@ResponseBody
	public Json remove(String id) {
		Json j = new Json();
		menuService.remove(id);
		j.setSuccess(true);
		j.setObj(id);
		j.setMsg("删除成功!");
		return j;
	}

	@RequestMapping("/add")
	@ResponseBody
	public Json add(Menu menu) {
		Json j = new Json();
		j.setSuccess(true);
		j.setObj(menuService.add(menu));
		j.setMsg("添加成功!");
		return j;
	}

	@RequestMapping("/edit")
	@ResponseBody
	public Json edit(Menu menu) {
		Json j = new Json();
		j.setSuccess(true);
		j.setObj(menuService.edit(menu));
		j.setMsg("编辑成功!");
		return j;
	}
	@RequestMapping("/hotmusicmanager")
	public ModelAndView getHotmusicTrecom(HttpServletRequest request){
		ModelAndView mv = new ModelAndView("recom/recommanager");
		mv.addObject("type","hotmusic");
		mv.addObject("datagrid","hotmusicrecom_datagrid");
		return mv;
	}
	@RequestMapping("/chmusicmanager")
	public ModelAndView getChmusicTrecom(HttpServletRequest request){
		ModelAndView mv = new ModelAndView("recom/recommanager");
		mv.addObject("type","chmusic");
		mv.addObject("datagrid","chmusicrecom_datagrid");
		return mv;
	}
	@RequestMapping("/enmusicmanager")
	public ModelAndView getEnmusicTrecom(HttpServletRequest request){
		ModelAndView mv = new ModelAndView("recom/recommanager");
		mv.addObject("type","enmusic");
		mv.addObject("datagrid","enmusicrecom_datagrid");
		return mv;
	}
	@RequestMapping("/ergemusicmanager")
	public ModelAndView getErgemusicTrecom(HttpServletRequest request){
		ModelAndView mv = new ModelAndView("recom/recommanager");
		mv.addObject("type","erge");
		mv.addObject("datagrid","ergerecom_datagrid");
		return mv;
	}
	
	@RequestMapping("/indexBottommanager")
	public ModelAndView getindexBottomTrecom(HttpServletRequest request){
		ModelAndView mv = new ModelAndView("recom/recommanager");
		mv.addObject("type","index_bottom");
		mv.addObject("datagrid","index_bottom_datagrid");
		return mv;
	}
	@RequestMapping("/indexVideomanager")
	public ModelAndView getindexVideoTrecom(HttpServletRequest request){
		ModelAndView mv = new ModelAndView("recom/recommanager");
		mv.addObject("type","index_video");
		mv.addObject("datagrid","index_video_datagrid");
		return mv;
	}

}
