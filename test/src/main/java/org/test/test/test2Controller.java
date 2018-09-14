package org.test.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
	/**
	 * test2컨트롤러
	 * @author test2Controller
	 *
	 */
	@Controller
	public class test2Controller {

		
		private static final Logger logger = LoggerFactory.getLogger(test2Controller.class);
		/**
		 * test2페이지를 이동을 관리하는컨틀
		 * @return test2인덱스로가는 uri
		 */
		@RequestMapping(value = "/test2", method = RequestMethod.GET)
		
		 public String test2() {
			
		  logger.info("hell2");
		  return "test2";

		 }

	}
