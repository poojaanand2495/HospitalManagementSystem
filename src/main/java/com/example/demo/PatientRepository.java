package com.example.demo;
@Repository
public interface PatientRepository extends MongoRepository<Patient,string>
{

}