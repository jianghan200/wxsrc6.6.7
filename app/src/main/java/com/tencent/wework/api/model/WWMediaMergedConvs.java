package com.tencent.wework.api.model;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WWMediaMergedConvs
  extends WWMediaMessage.WWMediaObject
{
  public List<WWMediaConversation> vzM = new ArrayList();
  
  public final boolean checkArgs()
  {
    if (!super.checkArgs()) {}
    while ((this.vzM == null) || (this.vzM.size() == 0)) {
      return false;
    }
    Iterator localIterator = this.vzM.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
    } while (((BaseMessage)localIterator.next()).checkArgs());
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public final void toBundle(Bundle paramBundle)
  {
    paramBundle.putInt("_wwmergedconvobject_messageslen", this.vzM.size());
    int i = 0;
    while (i < this.vzM.size())
    {
      paramBundle.putBundle("_wwmergedconvobject_messages" + i, BaseMessage.b((BaseMessage)this.vzM.get(i)));
      i += 1;
    }
    super.toBundle(paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/wework/api/model/WWMediaMergedConvs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */