package com.example.issue845.enums;

public enum OccupationClassCode {

	ACT("Accountant"),
	ADD("Administrator/Director"),
	ADJ("Adjusters"),
	ADM("Administrative"),
	AGR("Agronomist"),
	AIR("Airline Personnel"),
	ALLOT("All other officers and employees not listed above"),
	APR("Appraiser"),
	AR("Architect"),
	ART("Artist (Without Other Profession)"),
	AS("Surgeon's Assistant (SA)"),
	ATH("Athlete - Professional"),
	ATY("Actuary"),
	AUD("Auditor"),
	AUM("Automobile Mechanic"),
	AUS("Automobile Sales/Dealer"),
	BAD("Bank/Financial Institution - Administration"),
	BFI("Bank/Financial Institution - Clerical"),
	BKP("Bookkeeper"),
	BMG("Bank/Financial Institution - Management"),
	BRB("Barber, Hairdresser"),
	BUY("Buyer"),
	CA("Chartered Accountant"),
	CAN("Canvasser (Door-to-Door Salesperson)"),
	CAS("Cashier"),
	CCE("Crown Corporation Employee"),
	CCL("Credit Clerk"),
	CFT("Craftsman"),
	CHF("Chef"),
	Chiropractor("Chiropractor"),
	CHM("Consultant - Human Resources"),
	CHR("Chairperson"),
	CL("Clergy"),
	CMP("Computer - Analyst, Consultant, Programmer, etc."),
	CMT("Comptroller"),
	CO("Counselor (LPC, DSW)"),
	COL("Collector"),
	COT("Consultant - Other (Use 5RMK - Remarks to Describe)"),
	CP("Certified Clinical Perfusionist (CCP)"),
	CPA("Certified Public Accountant"),
	CRP("Carpenter"),
	CRT("Courts e.g. Bailiff, Clerk, Reporter, Stenographer, etc."),
	CS("Civil Service"),
	CST("Custodian"),
	CTR("Consultant - Training"),
	DAY("Daycare Worker, Provider"),
	DELY("Delivery"),
	DEN("Dentist"),
	DHY("Dental Hygenist"),
	DIE("Dietician, Nutritionist"),
	DIET("Dieticians who order food"),
	DIS("Disabled/Unable to work"),
	DMO("Demonstrator"),
	DRI("Driver"),
	DRL("Driver - Local Delivery"),
	DRM("Driver - Long Haul, Mover"),
	DRP("Driver - Public Transportation"),
	DRT("Driver - Taxi, Chauffeur, Instructor"),
	ELE("Electrician"),
	EM("Emergency Medical Technician (EMT)"),
	ENG("Engineer"),
	ENT("Entertainment Field e.g. Actor, Musician, etc."),
	EXE("Executive"),
	FAC("Factory Worker, Machine Operator, Tool & Die Worker"),
	FF("Firefighter"),
	FIN("Financial Advisor, Broker, Economist"),
	FIT("Fitness, Health Employee"),
	FL("Flagged Occupation"),
	FLA("Flight Attendant"),
	FOD("Food Industry - Other e.g. Butcher, Slaughterer"),
	FOI("Food Inspector"),
	FOR("Forest Employee"),
	FRM("Farmer"),
	FSH("Fisherman"),
	GC("General Contractor"),
	GDP("Graphic Designer, Printer"),
	HO("Homemaker"),
	HOT("Hotel, Motel Worker"),
	HRT("Horticulture"),
	IAB("Insurance - Agent, Broker"),
	IAD("Insurance - Adjuster"),
	INS("Instructor"),
	IUW("Insurance - Underwriter"),
	JAN("Janitors"),
	LAB("Labourer - Unskilled"),
	LAW("Lawyer"),
	LIB("Librarian"),
	LN("Licensed Practical Nurse (LPN)"),
	LOCK("Locker room attendants"),
	MAITR("Maitre D's and assistants"),
	MDR("Medical Director"),
	MGR("Manager"),
	MI("Military (Armed Forces)"),
	MIN("Miner"),
	MKT("Marketing Employee"),
	MNT("Maintenance, Janitor, Cleaner"),
	MSG("Messenger"),
	MSP("Medical Specialist e.g. Anaesthetist, Chiropractor, Podiatrist, etc."),
	NA("Nurse Anesthetist (CRNA)"),
	NM("Certified Nurse Midwife (CNM)"),
	NP("Nurse Practitioner (NP, DNP)"),
	NRS("Nurse"),
	NTR("Notary"),
	OF("Office, Sales"),
	OPI("Optician"),
	OPT("Optometrist, Opthamologist"),
	OT("Other"),
	PA("Physician's Assistant (PA)"),
	PAD("Professional, Advanced degree"),
	PAY("Payroll Distributor"),
	PCD("Professional, College degree"),
	PHO("Photographer, Photography Studio"),
	PHR("Pharmacist"),
	PHY("Physician"),
	PLT("Pilot"),
	PNT("Painter, Plasterer"),
	PO("Professional Manager"),
	POL("Police Officer"),
	PRO("Professor"),
	PS("Doctor of Psychology (PsyD)"),
	PST("Postal Worker"),
	PTO("Public Transportation Worker - Other Than Airline"),
	PUR("Purchasing Agent"),
	REA("Real Estate Agent"),
	REC("Receiving Clerk"),
	RET("Retired"),
	RGO("Refinery Gauger of Oil Company"),
	RN("Registered Nurse (RN)"),
	RSB("Restaurant, Bar - Owner, Employee e.g. Waiter, Bartender, etc."),
	RSC("Restaurant, Bar - Chef, Cook, Caterer"),
	RTS("Retail Sales Person"),
	SA("Salaried"),
	SAL("Salesperson - Commercial"),
	SC("Scientist"),
	SCT("School Teacher"),
	SE("Self-Employed"),
	SEC("Security Officer, Worker"),
	SHP("Shipping Clerk"),
	SK("Skilled, Semi-Skilled"),
	SMS("Seamstress"),
	SPR("Supervisor, Foreman"),
	SPS("Spouse at Home"),
	SSAT("Service Station attendants"),
	ST("Student"),
	STK("Storekeeper"),
	STO("Stock Clerk"),
	STR("Storeroom Personnel"),
	SU("Surgeon"),
	SUP("Superintendent"),
	TEC("Technicians - Research, Medical"),
	TES("Technical /Supervisory"),
	THR("Therapist"),
	TMK("Timekeeper"),
	TMSEC("Teachers having custody of money or securities"),
	TRD("Tradesman"),
	TRK("Truck Driver"),
	UN("Unknown"),
	UNEM("Unemployed"),
	US("Unskilled"),
	VET("Veterinarian"),
	WH("Warehouse Personnel"),
	WNC("Wine Cellar Personnel"),
	WNS("Wine Steward/ess"),
	WRT("Writer, Publisher"),
	;
	private String description;
	OccupationClassCode(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
	
}
