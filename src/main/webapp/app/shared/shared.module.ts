import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { Test1JHipsterAppSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [Test1JHipsterAppSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [Test1JHipsterAppSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class Test1JHipsterAppSharedModule {
  static forRoot() {
    return {
      ngModule: Test1JHipsterAppSharedModule
    };
  }
}
