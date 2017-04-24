package cc.hopebing.service;

import java.util.List;

import cc.hopebing.model.Person;

public interface IPersonService {
	/**
     * 加载全部的person
     * @return
     */
    public List<Person> loadPersons();
}
