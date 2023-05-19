INSERT INTO SUBJECT (subject_id,name,created_date,updated_date) VALUES(1,'T1','2022-12-20',null);
INSERT INTO SUBJECT (subject_id,name,created_date,updated_date) VALUES(2,'T2','2022-12-20',null);


INSERT INTO SET (set_id,name,created_date,updated_date) VALUES(1,'S1','2022-12-20',null);
INSERT INTO SET (set_id,name,created_date,updated_date) VALUES(2,'S2','2022-12-20',null);


INSERT INTO SUBJECT_SET (ts_id,subject_id,set_id,created_date,updated_date) VALUES(1,1,1,'2022-12-20',null);
INSERT INTO SUBJECT_SET (ts_id,subject_id,set_id,created_date,updated_date) VALUES(2,1,2,'2022-12-20',null);
INSERT INTO SUBJECT_SET (ts_id,subject_id,set_id,created_date,updated_date) VALUES(3,2,1,'2022-12-20',null);
--INSERT INTO SUBJECT_SET (ts_id,subject_id,set_id,created_date,updated_date) VALUES(4,2,2,'2022-12-20',null);

--INSERT INTO QUESTTION (ques_id,ts_id,name,created_date,updated_date) VALUES(1,1,'उत्तर भारत पर छाई कोहरे की चादर, चंडीगढ़-वाराणसी-लखनऊ की उड़ानें दिल्ली डायवर्ट','2022-12-20',null);
--INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(1,1,'O1','2022-12-20',null);
--INSERT INTO ANSWER (ans_id,opt_id,created_date,updated_date) VALUES(1,1,'2022-12-20',null);


--Question

INSERT INTO QUESTION (ques_id,ts_id,name,created_date,updated_date) VALUES(1,1,'कड़बक  के रचयिता हैं ' ,'2022-12-20',null);
INSERT INTO QUESTION (ques_id,ts_id,name,created_date,updated_date) VALUES(2,1,'साहित्य लहरी किनकी रचना हैं ' ,'2022-12-20',null);
INSERT INTO QUESTION (ques_id,ts_id,name,created_date,updated_date) VALUES(3,1,'कवितावली  के रचनाकार हैं ','2022-12-20',null);
INSERT INTO QUESTION (ques_id,ts_id,name,created_date,updated_date) VALUES(4,1,'छत्रसाल दशक  के रचनाकार हैं  ','2022-12-20',null);
INSERT INTO QUESTION (ques_id,ts_id,name,created_date,updated_date) VALUES(5,1,'गुलेरी जी की कहानी  उसने कहा था  किस शहर के भीड़ भरे बाजार से शुरू होती है ? ','2022-12-20',null);
INSERT INTO QUESTION (ques_id,ts_id,name,created_date,updated_date) VALUES(6,1,'भारतीय सिपाहियों का किसके साथ संघर्ष हुआ था ?','2022-12-20',null);
INSERT INTO QUESTION (ques_id,ts_id,name,created_date,updated_date) VALUES(7,1,'जयप्रकाश नारायण 1974 ई० आपातकाल के दौरान किस आंदोलन के लिए जेल गए?' ,'2022-12-20',null);
INSERT INTO QUESTION (ques_id,ts_id,name,created_date,updated_date) VALUES(8,1,'जयप्रकाश नारायण  के पिता का नाम क्या था? ','2022-12-20',null);
INSERT INTO QUESTION (ques_id,ts_id,name,created_date,updated_date) VALUES(9,1,'रेणुका  किसकी रचना है? ' ,'2022-12-20',null);
INSERT INTO QUESTION (ques_id,ts_id,name,created_date,updated_date) VALUES(10,1,'कहरानामा  किसी कृति है ? ','2022-12-20',null);

--Options

INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(1,1,'सूरदास','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(2,1,'कबीरदास','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(3,1,'जायसी ','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(4,1,'तुलसीदास','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(5,2,'जायसी ','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(6,2,'सूरदास','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(7,2,'कबीर ','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(8,2,'तुलसीदास','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(9,3,'जायसी ','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(10,3,'तुलसीदास','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(11,3,'कबीरदास ','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(12,3,'सूरदास','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(13,4,'तुलसीदास ','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(14,4,'जायसी','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(15,4,'भूषण ','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(16,4,'नाभादास','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(17,5,'हरियाणा ','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(18,5,'कांगड़ा','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(19,5,'अमृतसर ','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(20,5,'जयपुर ','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(21,6,'तुर्कों के साथ','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(22,6,'फ्रांसीसियों के साथ','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(23,6,'अंग्रेजों के साथ','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(24,6,'जर्मनों के साथ','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(25,7,'कृषक आंदोलन','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(26,7,'छात्र आंदोलन','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(27,7,'भूमिज आंदोलन','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(28,7,'इनमें से कोई नहीं','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(29,8,'जगतदयाल','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(30,8,'भगतदयाल ','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(31,8,'हरसूदयाल','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(32,8,'दीनदयाल','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(33,9,'चन्द्रधर शर्मा गुलेरी','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(34,9,'मोहन राकेश','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(35,9,'रामधारी सिंह दिनकर','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(36,9,'उदय प्रकाश','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(37,10,'मलिक मुहम्मद जायसी','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(38,10,'जयशंकर प्रसाद','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(39,10,'सुभद्रा कुमारी चौहान','2022-12-20',null);
INSERT INTO OPTION (opt_id,ques_id,name,created_date,updated_date) VALUES(40,10,'रघुवीर सहाय','2022-12-20',null);

--Answer

INSERT INTO ANSWER (ans_id,opt_id,ques_id,created_date,updated_date) VALUES(1,3,1,'2022-12-20',null);
INSERT INTO ANSWER (ans_id,opt_id,ques_id,created_date,updated_date) VALUES(2,6,2,'2022-12-20',null);
INSERT INTO ANSWER (ans_id,opt_id,ques_id,created_date,updated_date) VALUES(3,10,3,'2022-12-20',null);
INSERT INTO ANSWER (ans_id,opt_id,ques_id,created_date,updated_date) VALUES(4,15,4,'2022-12-20',null);
INSERT INTO ANSWER (ans_id,opt_id,ques_id,created_date,updated_date) VALUES(5,19,5,'2022-12-20',null);
INSERT INTO ANSWER (ans_id,opt_id,ques_id,created_date,updated_date) VALUES(6,24,6,'2022-12-20',null);
INSERT INTO ANSWER (ans_id,opt_id,ques_id,created_date,updated_date) VALUES(7,26,7,'2022-12-20',null);
INSERT INTO ANSWER (ans_id,opt_id,ques_id,created_date,updated_date) VALUES(8,31,8,'2022-12-20',null);
INSERT INTO ANSWER (ans_id,opt_id,ques_id,created_date,updated_date) VALUES(9,35,9,'2022-12-20',null);
INSERT INTO ANSWER (ans_id,opt_id,ques_id,created_date,updated_date) VALUES(10,37,10,'2022-12-20',null);

