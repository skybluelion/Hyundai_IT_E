package net.developia.spring04.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j;
import net.developia.spring04.domain.SampleVO;

@RestController
@RequestMapping("/sample")
@Log4j
public class SampleController {

	@GetMapping(value = "/getText", produces = "text/plain; charset=UTF-8")
	public ResponseEntity<String> getText() {
		log.info("MIME TYPE: " + MediaType.TEXT_PLAIN_VALUE); 
		
		return ResponseEntity.status(HttpStatus.OK).body("안녕하세요");
	}
	
	@GetMapping(value = "/getSample",
			 produces = { MediaType.APPLICATION_JSON_UTF8_VALUE,
					 	  MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<SampleVO> getSample() {
		return ResponseEntity.status(HttpStatus.OK).body(new SampleVO(112, "스타", "로드"));
	}
	
	@GetMapping(value = "/getSample2")
	public  ResponseEntity<SampleVO> getSample2() {
		return ResponseEntity.status(HttpStatus.OK).body(new SampleVO(113, "로켓", "라쿤"));
	}
	
	@GetMapping(value = "/getList")
	public ResponseEntity<List<SampleVO>> getList() {
		return ResponseEntity.status(HttpStatus.OK).body(
				IntStream.range(1,10).mapToObj(i -> new SampleVO(i, i + "First", i + " Last"))
				.collect(Collectors.toList())
				);
	}
	
	@GetMapping(value = "/getMap")
	public ResponseEntity<Map<String, SampleVO>> getMap() {
		Map<String, SampleVO> map = new HashMap<>();
		map.put("First",new SampleVO(111, "그루트", "주니어"));
		
		return ResponseEntity.status(HttpStatus.OK).body(map);
	}
	
	@GetMapping(value = "/check", params = {"height", "weight"})
	public ResponseEntity<SampleVO> check(Double height, Double weight) {
		SampleVO vo = new SampleVO(0, "" + height, "" + weight);
		ResponseEntity<SampleVO> result = null;
		
		if(height < 150) {
			result = ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(vo);
		} else {
			result = ResponseEntity.status(HttpStatus.OK).body(vo);
		}
		return result;
	}
}
