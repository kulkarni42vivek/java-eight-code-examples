SELECT Title
FROM Books
WHERE PublicationYear > 1900

--Sorting with ORDER BY — SELECT * FROM Books ORDER BY PublicationYear
--Limiting rows with LIMIT — SELECT * FROM Books LIMIT 5


--To add new records, your tool is INSERT. Specifying columns is optional but avoids confusion down the line.

INSERT INTO Books (Title, PublicationYear, AuthorID)
VALUES (‘New Book’, 2023, 5);

INSERT INTO Books (Title, PublicationYear, AuthorID)
VALUES
 (‘Book 1’, 2020, 1),
 (‘Book 2’, 2021, 2);

 INSERT INTO BooksArchived (Title, PublicationYear, AuthorID)
 SELECT Title, PublicationYear, AuthorID
 FROM Books
 WHERE PublicationYear < 2000


--To modify existing data, UPDATE does the trick. Set new values for columns and determine which rows to update using WHERE.

UPDATE Books
SET Title = ‘New Title’, PublicationYear = 2023
WHERE BookID = 5

UPDATE Books
SET InStock = 0
WHERE BookID IN (SELECT BookID
 FROM BookInventory
 WHERE Units < 1
