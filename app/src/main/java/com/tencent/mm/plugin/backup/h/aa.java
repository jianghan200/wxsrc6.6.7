package com.tencent.mm.plugin.backup.h;

import f.a.a.b;

public final class aa
  extends com.tencent.mm.bk.a
{
  public String hbD;
  public long hcP;
  public long hcQ;
  public String hcR;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbD == null) {
        throw new b("Not all required fields were included: BakChatName");
      }
      if (this.hcR == null) {
        throw new b("Not all required fields were included: MsgDataID");
      }
      if (this.hbD != null) {
        paramVarArgs.g(1, this.hbD);
      }
      paramVarArgs.T(2, this.hcP);
      paramVarArgs.T(3, this.hcQ);
      if (this.hcR != null) {
        paramVarArgs.g(4, this.hcR);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbD == null) {
        break label376;
      }
    }
    label376:
    for (paramInt = f.a.a.b.b.a.h(1, this.hbD) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.S(2, this.hcP) + f.a.a.a.S(3, this.hcQ);
      paramInt = i;
      if (this.hcR != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.hcR);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.hbD == null) {
          throw new b("Not all required fields were included: BakChatName");
        }
        if (this.hcR != null) {
          break;
        }
        throw new b("Not all required fields were included: MsgDataID");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        aa localaa = (aa)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localaa.hbD = locala.vHC.readString();
          return 0;
        case 2: 
          localaa.hcP = locala.vHC.rZ();
          return 0;
        case 3: 
          localaa.hcQ = locala.vHC.rZ();
          return 0;
        }
        localaa.hcR = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/backup/h/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */