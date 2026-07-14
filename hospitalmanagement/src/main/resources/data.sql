INSERT INTO patient
(patient_name, gender, dob, email, blood_group, created_at)
VALUES
    ('John Doe', 'Male', '1998-05-15', 'john@example.com', 'A_POSITIVE', CURRENT_TIMESTAMP),
    ('Alice Smith', 'Female', '2000-08-21', 'alice@example.com', 'B_POSITIVE', CURRENT_TIMESTAMP),
    ('Bob Johnson', 'Male', '1995-12-10', 'bob@example.com', 'O_POSITIVE', CURRENT_TIMESTAMP),
    ('Emma Brown', 'Female', '1999-03-18', 'emma@example.com', 'AB_NEGATIVE', CURRENT_TIMESTAMP),
    ('David Wilson', 'Male', '1997-07-30', 'david@example.com', 'A_NEGATIVE', CURRENT_TIMESTAMP)
    ON CONFLICT DO NOTHING;