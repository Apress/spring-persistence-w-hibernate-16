package com.apress.springpersistence.audiomanager.core.predicates;

import com.apress.springpersistence.audiomanager.core.domain.QPerson;
import com.mysema.query.types.Predicate;

/**
 * Created by pfisher on 3/24/16.
 */
final class PersonPredicates {

    private PersonPredicates() {

    }

    static Predicate personByNameOrEmail(String nameOrEmail) {
        return QPerson.person.personName.fullName.containsIgnoreCase(nameOrEmail).or(QPerson.person.email.equalsIgnoreCase(nameOrEmail));
    }

}
