package com.example.demo;
@RestController
@RequestMapping("/patients")
public class Controller
{
    private PatientRepository pr;
    public Controller(PatientRepository pr)
    {
        this.pr=new PatientRepository();

    }
    @GetMapping("/all")
    {
        public List <Patient> getAll
        {
            List<Patient> patients=this.pr.findAll();
            return patients;
        }
    }
}