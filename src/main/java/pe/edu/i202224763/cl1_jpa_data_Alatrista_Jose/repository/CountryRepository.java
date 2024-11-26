package pe.edu.i202224763.cl1_jpa_data_Alatrista_Jose.repository;

import pe.edu.i202224763.cl1_jpa_data_Alatrista_Jose.entity.Country;

import org.springframework.data.repository.CrudRepository;

    public interface CountryRepository extends CrudRepository<Country,String> {
        void deleteAllById(String code);
}
