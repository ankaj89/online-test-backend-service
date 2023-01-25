CREATE TABLE SUBJECT ( 
   subject_id INT NOT NULL, 
   name VARCHAR(50) NOT NULL, 
   created_date DATE NOT NULL,
   updated_date DATE,
);

CREATE TABLE SET ( 
   set_id INT NOT NULL, 
   name VARCHAR(50) NOT NULL , 
   created_date DATE NOT NULL,
   updated_date DATE,
);

CREATE TABLE SUBJECT_SET ( 
   ts_id INT NOT NULL, 
   subject_id INT NOT NULL,
   set_id INT NOT NULL, 
   created_date DATE NOT NULL,
   updated_date DATE,
);

CREATE TABLE QUESTION ( 
   ques_id INT NOT NULL, 
   ts_id INT NOT NULL,
   name VARCHAR(300) NOT NULL, 
   created_date DATE NOT NULL,
   updated_date DATE,
);

CREATE TABLE OPTION ( 
   opt_id INT NOT NULL, 
   ques_id INT,
   name VARCHAR(50) NOT NULL, 
   created_date DATE NOT NULL,
   updated_date DATE,
);

CREATE TABLE ANSWER ( 

   ans_id INT NOT NULL, 
   opt_id INT,
   ques_id INT ,
   created_date DATE NOT NULL,
   updated_date DATE,
);

CREATE TABLE USER_ANSWER ( 

   id INT NOT NULL, 
   opt_id INT NOT NULL,
   ques_id INT NOT NULL,
   created_date DATE NOT NULL
);

ALTER TABLE SUBJECT_SET
ADD FOREIGN KEY (subject_id) REFERENCES SUBJECT(subject_id);

ALTER TABLE SUBJECT_SET
ADD FOREIGN KEY (set_id) REFERENCES SET(set_id);

ALTER TABLE QUESTION
ADD FOREIGN KEY (ts_id) REFERENCES SUBJECT_SET(ts_id);

ALTER TABLE OPTION
ADD FOREIGN KEY (ques_id) REFERENCES QUESTION(ques_id);

ALTER TABLE ANSWER
ADD FOREIGN KEY (opt_id) REFERENCES OPTION(opt_id);

ALTER TABLE ANSWER
ADD FOREIGN KEY (ques_id) REFERENCES QUESTION(ques_id);
