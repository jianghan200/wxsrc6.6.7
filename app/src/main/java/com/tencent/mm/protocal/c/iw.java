package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class iw
  extends com.tencent.mm.bk.a
{
  public String riK;
  public LinkedList<String> rkj = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.riK == null) {
        throw new b("Not all required fields were included: brand_user_name");
      }
      if (this.riK != null) {
        paramVarArgs.g(2, this.riK);
      }
      paramVarArgs.d(3, 1, this.rkj);
      return 0;
    }
    if (paramInt == 1) {
      if (this.riK == null) {
        break label260;
      }
    }
    label260:
    for (paramInt = f.a.a.b.b.a.h(2, this.riK) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.c(3, 1, this.rkj);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rkj.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.riK != null) {
          break;
        }
        throw new b("Not all required fields were included: brand_user_name");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        iw localiw = (iw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 2: 
          localiw.riK = locala.vHC.readString();
          return 0;
        }
        localiw.rkj.add(locala.vHC.readString());
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/iw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */