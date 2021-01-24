package com.xworkz.handel;

import com.xworkz.handel.dto.PlayerDTO;
import com.xworkz.handel.dto.PlayerEvent;

public class PlayerTester {

	public static void main(String[] args) {
		PlayerEvent event= new PlayerEvent();
		
		PlayerDTO dto=new PlayerDTO();
		event.playerService(dto);
		
		event.playerService(null);
	}

}
