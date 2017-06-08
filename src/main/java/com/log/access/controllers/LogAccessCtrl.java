package com.log.access.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.log.access.entities.LogAccess;
import com.log.access.services.ILogAccessService;

/**
 * 
 * @author sebastian
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/logAccess")
public class LogAccessCtrl {
	/**
	 * 
	 */
	@Autowired
	private ILogAccessService logAccessService;
	/*
	 * 
	 */
	private Integer defaultPage = 0;
	/*
	 * 
	 */
	private Integer defaultSize = 10;

	/**
	 * 
	 * @return
	 */
	@GetMapping()
	public ResponseEntity<List<LogAccess>> getAll() {
		List<LogAccess> list = null;
		ResponseEntity<List<LogAccess>> response = null;
		list = logAccessService.getAll();
		if (list != null && list.size() > 0) {
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

//	/**
//	 * 
//	 * @param input
//	 * @return
//	 */
//	@PostMapping()
//	ResponseEntity<?> add(@RequestBody LogAccess input) {
//		ResponseEntity<String> response = null;
//		logAccessService.save(input);
//		response = new ResponseEntity<String>("Was successfully saved.", HttpStatus.OK);
//		return response;
//	}

	/**
	 * 
	 * @param from
	 * @param to
	 * @return
	 */
	@GetMapping("/da")
	public ResponseEntity<List<LogAccess>> getLogAccessBetweenDates(@RequestParam("from") String from,
			@RequestParam("to") String to) {
		List<LogAccess> list = null;
		ResponseEntity<List<LogAccess>> response = null;
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			list = logAccessService.getBetweenDates(formatter.parse(from), formatter.parse(to));
			if (list != null && list.size() > 0) {
				response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
			} else {
				response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	
	/**
	 * 
	 * @param from
	 * @param to
	 * @return
	 */
	@GetMapping("/dalo")
	public ResponseEntity<List<LogAccess>> getLogAccessBetweenDatesLogin(@RequestParam("from") String from,
			@RequestParam("to") String to, @RequestParam("login") String login) {
		List<LogAccess> list = null;
		ResponseEntity<List<LogAccess>> response = null;
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try {
			list = logAccessService.getBetweenDatesAndLogin(formatter.parse(from + " 00:00:00"), formatter.parse(to + " 23:59:59"), login);
			if (list != null && list.size() > 0) {
				response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
			} else {
				response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	/**
	 * 
	 * @param login
	 * @return
	 */
	@GetMapping("/lo/{login}")
	public ResponseEntity<List<LogAccess>> getLogAccessByLogin(@PathVariable("login") String login) {
		List<LogAccess> list = null;
		ResponseEntity<List<LogAccess>> response = null;
		list = logAccessService.getByLogin(login);
		if (list != null && list.size() > 0) {
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	/**
	 * 
	 * @param document
	 * @return
	 */
	@GetMapping("/do/{document}")
	public ResponseEntity<List<LogAccess>> getLogAccessByDocument(@PathVariable("document") String document) {
		List<LogAccess> list = null;
		ResponseEntity<List<LogAccess>> response = null;
		list = logAccessService.getByDocument(document);
		if (list != null && list.size() > 0) {
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	/**
	 * 
	 * @param action
	 * @return
	 */
	@GetMapping("/ac/{action}")
	public ResponseEntity<List<LogAccess>> getLogAccessByAction(@PathVariable("action") String action) {
		List<LogAccess> list = null;
		ResponseEntity<List<LogAccess>> response = null;
		list = logAccessService.getByAction(action);
		if (list != null && list.size() > 0) {
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	/**
	 * 
	 * @param nhc
	 * @return
	 */
	@GetMapping("/nh/{nhc}")
	public ResponseEntity<List<LogAccess>> getLogAccessByNhc(@PathVariable("nhc") String nhc) {
		List<LogAccess> list = null;
		ResponseEntity<List<LogAccess>> response = null;
		list = logAccessService.getByNhc(nhc);
		if (list != null && list.size() > 0) {
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	/**
	 * 
	 * @param nepisode
	 * @return
	 */
	@GetMapping("/ne/{nepisode}")
	public ResponseEntity<List<LogAccess>> getLogAccessBynNepisode(@PathVariable("nepisode") String nepisode) {
		List<LogAccess> list = null;
		ResponseEntity<List<LogAccess>> response = null;
		list = logAccessService.getByNepisode(nepisode);
		if (list != null && list.size() > 0) {
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	/**
	 * 
	 * @param ip
	 * @return
	 */
	@GetMapping("/i/{ip:.+}")
	public ResponseEntity<List<LogAccess>> getLogAccessByIp(@PathVariable("ip") String ip) {
		List<LogAccess> list = null;
		ResponseEntity<List<LogAccess>> response = null;
		list = logAccessService.getByIp(ip);
		if (list != null && list.size() > 0) {
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	/**
	 * 
	 * @param page
	 * @param size
	 * @param direction
	 * @return
	 */
	@GetMapping("/PS")
	public ResponseEntity<List<LogAccess>> getAllPS(@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "size", required = false) Integer size,
			@RequestParam(value = "direction", required = false) String direction) {
		List<LogAccess> list = new ArrayList<>();
		Page<LogAccess> listPS = null;
		ResponseEntity<List<LogAccess>> response = null;
		PageRequest pageRequest = getPageRequest(page, size, direction, "rCreationDate");
		listPS = logAccessService.getAll(pageRequest);
		if (listPS != null && listPS.getContent().size() > 0) {
			list.addAll(listPS.getContent());
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	/**
	 * 
	 * @param from
	 * @param to
	 * @param page
	 * @param size
	 * @param direction
	 * @return
	 */
	@GetMapping("/PS/da")
	public ResponseEntity<List<LogAccess>> getLogAccessBetweenDates(@RequestParam("from") String from,
			@RequestParam("to") String to, @RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "size", required = false) Integer size,
			@RequestParam(value = "direction", required = false) String direction) {
		List<LogAccess> list = new ArrayList<>();
		Page<LogAccess> listPS = null;
		ResponseEntity<List<LogAccess>> response = null;
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			PageRequest request = getPageRequest(page, size, direction, "rCreationDate");
			listPS = logAccessService.getBetweenDates(formatter.parse(from), formatter.parse(to), request);
			if (listPS != null && listPS.getContent().size() > 0) {
				list.addAll(listPS.getContent());
				response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
			} else {
				response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	
	/**
	 * 
	 * @param from
	 * @param to
	 * @return
	 */
	@GetMapping("/PS/dalo")
	public ResponseEntity<List<LogAccess>> getLogAccessBetweenDatesLogin(@RequestParam("from") String from,
			@RequestParam("to") String to, @RequestParam("login") String login, @RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "size", required = false) Integer size,
			@RequestParam(value = "direction", required = false) String direction) {
		List<LogAccess> list = new ArrayList<>();
		Page<LogAccess> listPS = null;
		ResponseEntity<List<LogAccess>> response = null;
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			PageRequest request = getPageRequest(page, size, direction, "rCreationDate");
			listPS = logAccessService.getBetweenDatesAndLogin(formatter.parse(from), formatter.parse(to), login, request);
			if (listPS != null && listPS.getContent().size() > 0) {
				list.addAll(listPS.getContent());
				response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
			} else {
				response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	/**
	 * 
	 * @param login
	 * @param page
	 * @param size
	 * @param direction
	 * @return
	 */
	@GetMapping("/PS/lo/{login}")
	public ResponseEntity<List<LogAccess>> getLogAccessByLogin(@PathVariable("login") String login,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "size", required = false) Integer size,
			@RequestParam(value = "direction", required = false) String direction) {
		List<LogAccess> list = new ArrayList<>();
		Page<LogAccess> listPS = null;
		ResponseEntity<List<LogAccess>> response = null;
		PageRequest pageRequest = getPageRequest(page, size, direction, "login");
		listPS = logAccessService.getByLogin(login, pageRequest);
		if (listPS != null && listPS.getContent().size() > 0) {
			list.addAll(listPS.getContent());
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	/**
	 * 
	 * @param document
	 * @param page
	 * @param size
	 * @param direction
	 * @return
	 */
	@GetMapping("/PS/do/{document}")
	public ResponseEntity<List<LogAccess>> getLogAccessByDocument(@PathVariable("document") String document,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "size", required = false) Integer size,
			@RequestParam(value = "direction", required = false) String direction) {
		List<LogAccess> list = new ArrayList<>();
		Page<LogAccess> listPS = null;
		ResponseEntity<List<LogAccess>> response = null;
		PageRequest pageRequest = getPageRequest(page, size, direction, "document");
		listPS = logAccessService.getByDocument(document, pageRequest);
		if (listPS != null && listPS.getContent().size() > 0) {
			list.addAll(listPS.getContent());
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	/**
	 * 
	 * @param action
	 * @param page
	 * @param size
	 * @param direction
	 * @return
	 */
	@GetMapping("/PS/ac/{action}")
	public ResponseEntity<List<LogAccess>> getLogAccessByAction(@PathVariable("action") String action,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "size", required = false) Integer size,
			@RequestParam(value = "direction", required = false) String direction) {
		List<LogAccess> list = new ArrayList<>();
		Page<LogAccess> listPS = null;
		ResponseEntity<List<LogAccess>> response = null;
		PageRequest pageRequest = getPageRequest(page, size, direction, "action");
		listPS = logAccessService.getByAction(action, pageRequest);
		if (listPS != null && listPS.getContent().size() > 0) {
			list.addAll(listPS.getContent());
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	/**
	 * 
	 * @param nhc
	 * @param page
	 * @param size
	 * @param direction
	 * @return
	 */
	@GetMapping("/PS/nh/{nhc}")
	public ResponseEntity<List<LogAccess>> getLogAccessByNhc(@PathVariable("nhc") String nhc,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "size", required = false) Integer size,
			@RequestParam(value = "direction", required = false) String direction) {
		List<LogAccess> list = new ArrayList<>();
		Page<LogAccess> listPS = null;
		ResponseEntity<List<LogAccess>> response = null;
		PageRequest pageRequest = getPageRequest(page, size, direction, "nhc");
		listPS = logAccessService.getByNhc(nhc, pageRequest);
		if (listPS != null && listPS.getContent().size() > 0) {
			list.addAll(listPS.getContent());
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	/**
	 * 
	 * @param nepisode
	 * @param page
	 * @param size
	 * @param direction
	 * @return
	 */
	@GetMapping("/PS/ne/{nepisode}")
	public ResponseEntity<List<LogAccess>> getLogAccessBynNepisode(@PathVariable("nepisode") String nepisode,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "size", required = false) Integer size,
			@RequestParam(value = "direction", required = false) String direction) {
		List<LogAccess> list = new ArrayList<>();
		Page<LogAccess> listPS = null;
		ResponseEntity<List<LogAccess>> response = null;
		PageRequest pageRequest = getPageRequest(page, size, direction, "nepisode");
		listPS = logAccessService.getByNepisode(nepisode, pageRequest);
		if (listPS != null && listPS.getContent().size() > 0) {
			list.addAll(listPS.getContent());
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	/**
	 * 
	 * @param ip
	 * @param page
	 * @param size
	 * @param direction
	 * @return
	 */
	@GetMapping("/PS/i/{ip:.+}")
	public ResponseEntity<List<LogAccess>> getLogAccessByIp(@PathVariable("ip") String ip,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "size", required = false) Integer size,
			@RequestParam(value = "direction", required = false) String direction) {
		List<LogAccess> list = new ArrayList<>();
		Page<LogAccess> listPS = null;
		ResponseEntity<List<LogAccess>> response = null;
		PageRequest pageRequest = getPageRequest(page, size, direction, "ip");
		listPS = logAccessService.getByIp(ip, pageRequest);
		if (listPS != null && listPS.getContent().size() > 0) {
			list.addAll(listPS.getContent());
			response = new ResponseEntity<List<LogAccess>>(list, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<LogAccess>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	/**
	 * 
	 * @param page
	 * @param size
	 * @param direction
	 * @param props
	 * @return
	 */
	private PageRequest getPageRequest(Integer page, Integer size, String direction, String... props) {
		Sort sort = direction != null && direction.equals("DESC") ? sort = new Sort(Sort.Direction.DESC, props)
				: new Sort(Sort.Direction.ASC, props);
		Integer p = page != null ? page : this.defaultPage;
		Integer s = size != null ? size : this.defaultSize;
		PageRequest request = new PageRequest(p.intValue(), s.intValue(), sort);
		return request;
	}

}
