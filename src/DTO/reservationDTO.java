package DTO;

import java.util.Date;

public class reservationDTO {
	private int reservation_id;
	private String name;
	private String company;
	private int room_id;
	private String reservation_day;
	private int start_time;
	private int end_time;
	private String mail;
	private String guest;
	private String tool;

	public reservationDTO(int reservation_id,String name,String company,int room_id,String reservation_day,int start_time,int end_time,String mail,String guest,String tool){
		setReservation_id(reservation_id);
		setName(name);
		setCompany(company);
		setRoom_id(room_id);
		setReservation_day(reservation_day);
		setStart_time(start_time);
		setEnd_time(end_time);
		setMail(mail);
		setGuest(guest);
		setTool(tool);
	}

	public int getReservation_id() {
		return reservation_id;
	}

	public void setReservation_id(int reservation_id) {
		this.reservation_id = reservation_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public String getReservation_day() {
		return reservation_day;
	}

	public void setReservation_day(String reservation_day) {
		this.reservation_day = reservation_day;
	}

	public int getStart_time() {
		return start_time;
	}

	public void setStart_time(int start_time) {
		this.start_time = start_time;
	}

	public int getEnd_time() {
		return end_time;
	}

	public void setEnd_time(int end_time) {
		this.end_time = end_time;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getGuest() {
		return guest;
	}

	public void setGuest(String guest) {
		this.guest = guest;
	}

	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}

}