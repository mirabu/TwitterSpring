package com.example.TwitterSpring.Repo;


import com.example.TwitterSpring.Model.StrudentData;
import com.example.TwitterSpring.Model.UserLoginResponse;
import com.example.TwitterSpring.Model.UserRegisterData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class UserRegisterImpl implements UserRegisterService{


    @Autowired
    private UserRegisterService userRegister;


    public boolean existingUserName(String userName) {
        return userRegister.existingUserName(userName);
    }


    public boolean existingEmail(String email) {
        return userRegister.existingEmail(email);
    }

    @Override
    public UserRegisterData findByEmail(String email) {
        return userRegister.findByEmail(email);
    }

    public UserRegisterData saveUserData(UserRegisterData userRegisterData){
        return userRegister.save(userRegisterData);
    }


    @Override
    public void flush() {

    }

    @Override
    public <S extends UserRegisterData> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends UserRegisterData> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<UserRegisterData> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public UserRegisterData getOne(Long aLong) {
        return null;
    }

    @Override
    public UserRegisterData getById(Long aLong) {
        return null;
    }

    @Override
    public UserRegisterData getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends UserRegisterData> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends UserRegisterData> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends UserRegisterData> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends UserRegisterData> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends UserRegisterData> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends UserRegisterData> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends UserRegisterData, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends UserRegisterData> S save(S entity) {
        return null;
    }

    @Override
    public <S extends UserRegisterData> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<UserRegisterData> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<UserRegisterData> findAll() {
        return List.of();
    }

    @Override
    public List<UserRegisterData> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(UserRegisterData entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends UserRegisterData> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<UserRegisterData> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<UserRegisterData> findAll(Pageable pageable) {
        return null;
    }
}
