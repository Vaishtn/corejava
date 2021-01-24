package com.xworkz.redbus.dto;

	
	import com.xworkz.redbus.contract.CustomCloneable;

	public class PhoneBookDTO implements CustomCloneable{

		private String name;
		private String pincode;
		private long phoneNo;

		public PhoneBookDTO() {
			System.out.println("Created PhoneBookDTO");
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPincode() {
			return pincode;
		}

		public void setPincode(String pincode) {
			this.pincode = pincode;
		}

		public long getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}

		@Override
		public PhoneBookDTO clone() throws CloneNotSupportedException {
			System.out.println("invoked clone");
			return (PhoneBookDTO) super.clone();
		}

		@Override
		public String toString() {
			return "PhoneBookDTO [name=" + name + ", pincode=" + pincode + ", phoneNo=" + phoneNo + "]";
		}

		@Override
		public int hashCode() {
			return 12;
		}

		@Override
		public boolean equals(Object obj) {

			if (obj != null) {
				if (this == obj) {
					return true;
				}
				if (obj instanceof PhoneBookDTO) {
					PhoneBookDTO dto = (PhoneBookDTO) obj;
					if (dto.getPhoneNo() == this.phoneNo) {
						return true;
					}
				} else {
					return false;
				}
			}
			return false;
		}


}