import { NgModule } from '@angular/core';

import { Test1JHipsterAppSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
  imports: [Test1JHipsterAppSharedLibsModule],
  declarations: [JhiAlertComponent, JhiAlertErrorComponent],
  exports: [Test1JHipsterAppSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class Test1JHipsterAppSharedCommonModule {}
