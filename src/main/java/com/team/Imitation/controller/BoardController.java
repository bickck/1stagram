package com.team.Imitation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team.Imitation.controller.dto.RequestBoardDTO;

@Controller
@RequestMapping(value = "/board")
public class BoardController {

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void boardSave(@ModelAttribute RequestBoardDTO boardDTO) {

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void boardUpdate(@ModelAttribute RequestBoardDTO boardDTO) {

	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void boardDelete(@ModelAttribute RequestBoardDTO boardDTO) {

	}
}
