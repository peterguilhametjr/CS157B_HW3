SELECT 
A, B1, C1, B2, C2, B3, C3, B4, C4, B5, C5, B6, C6, B7, C7  
FROM 
(((((R1 NATURAL JOIN R2) NATURAL JOIN R3) NATURAL JOIN R4) NATURAL JOIN R5) NATURAL JOIN R6) NATURAL JOIN R7;


SELECT 
A, B1, C1, B2, C2, B3, C3, B4, C4, B5, C5, B6, C6, B7, C7  
FROM 
R1 NATURAL JOIN (R2 NATURAL JOIN (R3 NATURAL JOIN (R4 NATURAL JOIN (R5 NATURAL JOIN (R6 NATURAL JOIN R7)))));


SELECT 
A, B1, C1, B2, C2, B3, C3, B4, C4, B5, C5, B6, C6, B7, C7  
FROM 
((R1 NATURAL JOIN R2) NATURAL JOIN (R3 NATURAL JOIN R4)) NATURAL JOIN ((R5 NATURAL JOIN R6) NATURAL JOIN R7);