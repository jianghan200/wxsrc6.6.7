package com.tencent.mm.modelrecovery;

import com.tencent.recovery.RecoveryLogic;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.model.RecoveryHandleItem;
import com.tencent.recovery.option.CommonOptions;
import com.tencent.recovery.option.OptionFactory;
import com.tencent.recovery.wx.service.WXRecoveryUploadService;
import com.tencent.tinker.lib.service.AbstractResultService;
import com.tencent.tinker.lib.service.a;
import java.util.ArrayList;

public class RecoveryTinkerResultService
  extends AbstractResultService
{
  public final void a(a parama)
  {
    RecoveryLog.i("Recovery.RecoveryTinkerResultService", "RecoveryTinkerResultService receive result: %s", new Object[] { parama });
    CommonOptions localCommonOptions = OptionFactory.hj(this);
    ArrayList localArrayList = new ArrayList();
    RecoveryHandleItem localRecoveryHandleItem = new RecoveryHandleItem();
    localRecoveryHandleItem.fMk = localCommonOptions.fMk;
    localRecoveryHandleItem.clientVersion = localCommonOptions.clientVersion;
    localRecoveryHandleItem.timestamp = System.currentTimeMillis();
    localRecoveryHandleItem.aAL = "KeyPatchResultTotalCount";
    if (parama.bLW)
    {
      RecoveryLog.i("Recovery.RecoveryTinkerResultService", "patch success", new Object[0]);
      localRecoveryHandleItem.aAL = "KeyPatchResultSuccessCount";
    }
    for (;;)
    {
      localArrayList.add(localRecoveryHandleItem);
      RecoveryLogic.a(this, localArrayList, WXRecoveryUploadService.class.getName());
      stopSelf();
      return;
      RecoveryLog.i("Recovery.RecoveryTinkerResultService", "patch fail ", new Object[0]);
      if (parama.vhq != null)
      {
        RecoveryLog.i("Recovery.RecoveryTinkerResultService", "fail reason %s", new Object[] { parama.vhq.getMessage() });
        localRecoveryHandleItem.aAL = String.format("%s[%s]", new Object[] { "KeyPatchResultFailCount", parama.vhq.getMessage() });
      }
      else
      {
        localRecoveryHandleItem.aAL = "KeyPatchResultFailCount";
      }
    }
  }
  
  public void onCreate()
  {
    super.onCreate();
    RecoveryLog.i("Recovery.RecoveryTinkerResultService", "onCreate", new Object[0]);
  }
  
  public void onDestroy()
  {
    RecoveryLog.i("Recovery.RecoveryTinkerResultService", "onDestroy", new Object[0]);
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelrecovery/RecoveryTinkerResultService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */