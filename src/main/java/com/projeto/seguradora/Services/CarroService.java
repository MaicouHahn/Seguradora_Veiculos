package com.projeto.seguradora.Services;

import com.projeto.seguradora.Entities.Carro;
import com.projeto.seguradora.Entities.Cliente;
import com.projeto.seguradora.Repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class CarroService  {

    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> findAll(){
        return carroRepository.findAll();
    }

    public Carro findById(Long id){
        Optional<Carro>obj = carroRepository.findById(id);
        return obj.orElseThrow(()->new RuntimeException());
    }

    public void delete(Long id){
        carroRepository.deleteById(id);
    }

    public Carro update(Long id,Carro carro){
        Carro carroDTO = carroRepository.getReferenceById(id);
        updateCarro(carroDTO,carro);
        return carroRepository.save(carroDTO);
    }

    private void updateCarro(Carro carroDTO, Carro carro){
        carroDTO.setAno(carro.getAno());
        carroDTO.setCor(carro.getCor());
        carroDTO.setMarca(carro.getMarca());
        carroDTO.setPlaca(carro.getPlaca());
        carroDTO.setChassi(carro.getChassi());
        carroDTO.setModelo(carro.getModelo());
    }

    public Carro insert(Carro carro){
        carro.setId(null);
        return carroRepository.save(carro);
    }
}
