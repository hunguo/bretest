package org.test.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
	/**
	 * test1컨트롤러
	 * @author test1Controller
	 *
	 */
	@Controller
	public class test1Controller {
	
		private static final Logger logger = LoggerFactory.getLogger(test1Controller.class);
		/**
		 * test1페이지를 이동을 관리하는컨틀
		 * @return test1인덱스로가는 uri
		 */
		@RequestMapping(value = "/test1", method = RequestMethod.GET)
		
		 public String test1() {
			
			
		  logger.info("hell1");
		  return "test1";

		 }

	}
