package com.tencent.mm.plugin.backup.h;

import f.a.a.b;
import java.util.LinkedList;

public final class z
  extends com.tencent.mm.bk.a
{
  public String hbD;
  public long hcP;
  public long hcQ;
  public String hcR;
  public String hcS;
  public LinkedList<String> hcv = new LinkedList();
  
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
      if (this.hcS == null) {
        throw new b("Not all required fields were included: NickName");
      }
      if (this.hbD != null) {
        paramVarArgs.g(1, this.hbD);
      }
      paramVarArgs.T(2, this.hcP);
      paramVarArgs.T(3, this.hcQ);
      if (this.hcR != null) {
        paramVarArgs.g(4, this.hcR);
      }
      if (this.hcS != null) {
        paramVarArgs.g(5, this.hcS);
      }
      paramVarArgs.d(6, 1, this.hcv);
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbD == null) {
        break label518;
      }
    }
    label518:
    for (paramInt = f.a.a.b.b.a.h(1, this.hbD) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.S(2, this.hcP) + f.a.a.a.S(3, this.hcQ);
      paramInt = i;
      if (this.hcR != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.hcR);
      }
      i = paramInt;
      if (this.hcS != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.hcS);
      }
      return i + f.a.a.a.c(6, 1, this.hcv);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.hcv.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.hbD == null) {
          throw new b("Not all required fields were included: BakChatName");
        }
        if (this.hcR == null) {
          throw new b("Not all required fields were included: MsgDataID");
        }
        if (this.hcS != null) {
          break;
        }
        throw new b("Not all required fields were included: NickName");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        z localz = (z)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localz.hbD = locala.vHC.readString();
          return 0;
        case 2: 
          localz.hcP = locala.vHC.rZ();
          return 0;
        case 3: 
          localz.hcQ = locala.vHC.rZ();
          return 0;
        case 4: 
          localz.hcR = locala.vHC.readString();
          return 0;
        case 5: 
          localz.hcS = locala.vHC.readString();
          return 0;
        }
        localz.hcv.add(locala.vHC.readString());
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/h/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */