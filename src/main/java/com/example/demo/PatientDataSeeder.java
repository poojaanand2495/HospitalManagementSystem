package com.example.demo;
@Component
public class PatientDataSeeder implements CommandLineRunner
{
    private PatientRepository p;
    public PatientDataSeeder(PatientRepsitory)
    {
        this.p=new PatientRepository();

    }
    @Override
    public void run(String...strings)throws Exception {

        Patient p1 = new Patient("pooja", 22);
        Patient p2 = new Patient("b", 23);
        Patient p3 = new Patient("c", 24);
        this.p.deleteAll();
        List<Patient> patients = Array.asList(p1, p2, p3);
        this.p.save(patients);
    }

    }
