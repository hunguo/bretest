package org.test.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * index컨트롤러
 * @author indexController
 *
 */
@Controller
public class indexController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(indexController.class);
	/**
	 * index페이지를 이동을 관리하는컨틀
	 * @return 인덱스로가는 uri
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	 public String index() {
		
	  logger.info("hell");
	  return "index";

	 }
}
