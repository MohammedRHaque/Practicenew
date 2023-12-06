package encapsulation_getter_setter2;

import java.sql.Date;

public class Contact {

	private String guestname;
	private int contactno;
	private int roomno;
	private Date checkinDate;
	private Date checkoutDate;
	private int noofNights;
	private int payment;
	
	public Contact (String guestname, int cont, int roomno, Date CheckinDate, Date CheckoutDate, int noofNights, int payments) {
		this.guestname = guestname;
		this.contactno = cont;
		this.roomno = roomno;
		this.checkinDate = CheckinDate;
		this.checkoutDate = CheckoutDate;
		this.noofNights = noofNights;
		this.payment = payments;
		
	}

	public String getGuestname() {
		return guestname;
	}

	public void setGuestname(String guestname) {
		this.guestname = guestname;
	}

	public int getContactno() {
		return contactno;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

	public int getRoomno() {
		return roomno;
	}

	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}

	public Date getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public int getNoofNights() {
		return noofNights;
	}

	public void setNoofNights(int noofNights) {
		this.noofNights = noofNights;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

}
