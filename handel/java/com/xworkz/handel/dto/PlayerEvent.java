package com.xworkz.handel.dto;
import com.xworkz.handel.dto.PlayerDTO;

public class PlayerEvent {
	public PlayerEvent() {
		System.out.println("invoked constructor");
	}
	
	public void playerService(PlayerDTO dto) {
		String name=null;
		String sport=null;
		int jersyNo=0;
		try {
			System.out.println("start of try");
			name=dto.getName();
			sport=dto.getSport();
			jersyNo=dto.getJerstNo();
			
			
				int[] a= {1};
				System.out.println(a[0]);
				System.out.println("end of try");
			}catch(NullPointerException np) {
				System.out.println("handel NullPointerException");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("handel ArrayIndexOutOfBoundsException ");
		}
			
			System.out.println("exception handeled");
			System.out.println(name);
			System.out.println(jersyNo);
			System.out.println(sport);
			
		}
		
	}


