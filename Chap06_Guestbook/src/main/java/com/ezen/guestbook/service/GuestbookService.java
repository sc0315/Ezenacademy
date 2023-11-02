package com.ezen.guestbook.service;


import com.ezen.guestbook.dto.GuestbookDTO;
import com.ezen.guestbook.dto.PageRequestDTO;
import com.ezen.guestbook.dto.PageResultDTO;
import com.ezen.guestbook.entity.Guestbook;

public interface GuestbookService {
	 Long register(GuestbookDTO dto);
	 
	//추가
	    PageResultDTO<GuestbookDTO, Guestbook> getList(PageRequestDTO requestDTO);
	 
	 
	//아래 매퍼(dto->entity) 메서드 추가
	    default Guestbook dtoToEntity(GuestbookDTO dto) {
	        Guestbook entity = Guestbook.builder()
	                .gno(dto.getGno())
	                .title(dto.getTitle())
	                .content(dto.getContent())
	                .writer(dto.getWriter())
	                .build();
	        return entity;
	    }
	    
	  //추가
	    default GuestbookDTO entityToDto(Guestbook entity) {
	        GuestbookDTO dto = GuestbookDTO.builder()
	                .gno(entity.getGno())
	                .title(entity.getTitle())
	                .content(entity.getContent())
	                .writer(entity.getWriter())
	                .regDate(entity.getRegDate())
	                .modDate(entity.getModDate())
	                .build();

	        return dto;
	    }
	    
	    GuestbookDTO read(Long gno);
	    
	    void remove(Long gno);
	    
	    void modify(GuestbookDTO dto);
	    
	    
}
