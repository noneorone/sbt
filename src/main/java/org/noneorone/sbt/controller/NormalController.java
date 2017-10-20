package org.noneorone.sbt.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.noneorone.sbt.domain.Dept;
import org.noneorone.sbt.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 *
 * @author Mars.Wong(noneorone@yeah.net) at 2017/7/19 14:01<br/>
 * @since 1.0
 */
// @Controller
@RestController
@MapperScan("org.noneorone.sbt.mapper")
@EntityScan("org.noneorone.sbt.domain")
public class NormalController {

	@Autowired
	private DeptMapper deptMapper;

	@RequestMapping(value = "sbt/hello")
	public String hello(Model model, @RequestParam(value = "name", required = false, defaultValue = "world") String name) {
		model.addAttribute("name", name);
		return "hello-" + name;
	}

	@RequestMapping(value = "sbt/selectById")
	public String selectById(@RequestParam(value = "id", required = true, defaultValue = "1") Integer id) {
		Dept dept = deptMapper.selectDeptById(1);
		if (dept != null) {
			return dept.toString();
		}

		return "not found the object[id=" + id + "]";
	}

}
