/*
Copyright(c) 2016 kobaken0029 All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package click.kobaken.rxirohaandroid.usecase;

import java.util.List;

import javax.inject.Inject;

import click.kobaken.rxirohaandroid.model.Domain;
import click.kobaken.rxirohaandroid.repository.DomainRepository;
import io.reactivex.Observable;

public class GetDomainsUseCase {
    private final DomainRepository domainRepository;

    @Inject
    public GetDomainsUseCase(DomainRepository domainRepository) {
        this.domainRepository = domainRepository;
    }

    public Observable<List<Domain>> run(final int limit, final int offset) {
        return domainRepository.findDomains(limit, offset);
    }
}
