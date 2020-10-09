package cn.aust.jike_16_1.car.dao;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class User {
	private int id;
	private String username;
	private String password;
	private String phone;
	private String car_name;
	private String oil_now;
	private String oil_date;
	private String oil_area;
	private String oil_price;
	private String oil_count;
	private String oil_money;
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", phone=" + phone
				+ ", car_name=" + car_name + ", oil_now=" + oil_now + ", oil_date=" + oil_date + ", oil_area="
				+ oil_area + ", oil_price=" + oil_price + ", oil_count=" + oil_count + ", oil_money=" + oil_money + "]";
	}
	
}
