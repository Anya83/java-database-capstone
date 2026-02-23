# MySQL Database Schema Design

## 1. users
Stores login information for all users (Admin, Doctor, Patient).

| Field Name | Data Type | Description |
|-----------|----------|-------------|
| user_id | INT (PK, AUTO_INCREMENT) | Unique user ID |
| name | VARCHAR(100) | Full name |
| email | VARCHAR(100) | Email address |
| password | VARCHAR(255) | Encrypted password |
| role | ENUM('ADMIN','DOCTOR','PATIENT') | User role |

---

## 2. doctors
Stores doctor-specific details.

| Field Name | Data Type | Description |
|-----------|----------|-------------|
| doctor_id | INT (PK, AUTO_INCREMENT) | Unique doctor ID |
| user_id | INT (FK) | References users(user_id) |
| specialization | VARCHAR(100) | Medical specialization |
| experience | INT | Years of experience |

---

## 3. patients
Stores patient-specific information.

| Field Name | Data Type | Description |
|-----------|----------|-------------|
| patient_id | INT (PK, AUTO_INCREMENT) | Unique patient ID |
| user_id | INT (FK) | References users(user_id) |
| age | INT | Patient age |
| gender | VARCHAR(10) | Gender |

---

## 4. appointments
Stores appointment details.

| Field Name | Data Type | Description |
|-----------|----------|-------------|
| appointment_id | INT (PK, AUTO_INCREMENT) | Appointment ID |
| doctor_id | INT (FK) | References doctors(doctor_id) |
| patient_id | INT (FK) | References patients(patient_id) |
| appointment_date | DATETIME | Appointment date and time |
| status | VARCHAR(20) | Scheduled / Completed / Cancelled |

---

## Relationships
- users.user_id → doctors.user_id
- users.user_id → patients.user_id
- doctors.doctor_id → appointments.doctor_id
- patients.patient_id → appointments.patient_id
