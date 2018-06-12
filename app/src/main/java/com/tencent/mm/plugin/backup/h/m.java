package com.tencent.mm.plugin.backup.h;

import f.a.a.b;

public final class m
  extends com.tencent.mm.bk.a
{
  public String hbO;
  public String hbP;
  public String hbQ;
  public String hbR;
  public String hbS;
  public int hbT;
  public long hbU;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbO == null) {
        throw new b("Not all required fields were included: DeviceID");
      }
      if (this.hbP == null) {
        throw new b("Not all required fields were included: DeviceName");
      }
      if (this.hbQ == null) {
        throw new b("Not all required fields were included: Model");
      }
      if (this.hbR == null) {
        throw new b("Not all required fields were included: SystemName");
      }
      if (this.hbS == null) {
        throw new b("Not all required fields were included: SystemVersion");
      }
      if (this.hbO != null) {
        paramVarArgs.g(1, this.hbO);
      }
      if (this.hbP != null) {
        paramVarArgs.g(2, this.hbP);
      }
      if (this.hbQ != null) {
        paramVarArgs.g(3, this.hbQ);
      }
      if (this.hbR != null) {
        paramVarArgs.g(4, this.hbR);
      }
      if (this.hbS != null) {
        paramVarArgs.g(5, this.hbS);
      }
      paramVarArgs.fT(6, this.hbT);
      paramVarArgs.T(7, this.hbU);
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbO == null) {
        break label645;
      }
    }
    label645:
    for (int i = f.a.a.b.b.a.h(1, this.hbO) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hbP != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hbP);
      }
      i = paramInt;
      if (this.hbQ != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.hbQ);
      }
      paramInt = i;
      if (this.hbR != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.hbR);
      }
      i = paramInt;
      if (this.hbS != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.hbS);
      }
      return i + f.a.a.a.fQ(6, this.hbT) + f.a.a.a.S(7, this.hbU);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.hbO == null) {
          throw new b("Not all required fields were included: DeviceID");
        }
        if (this.hbP == null) {
          throw new b("Not all required fields were included: DeviceName");
        }
        if (this.hbQ == null) {
          throw new b("Not all required fields were included: Model");
        }
        if (this.hbR == null) {
          throw new b("Not all required fields were included: SystemName");
        }
        if (this.hbS != null) {
          break;
        }
        throw new b("Not all required fields were included: SystemVersion");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        m localm = (m)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localm.hbO = locala.vHC.readString();
          return 0;
        case 2: 
          localm.hbP = locala.vHC.readString();
          return 0;
        case 3: 
          localm.hbQ = locala.vHC.readString();
          return 0;
        case 4: 
          localm.hbR = locala.vHC.readString();
          return 0;
        case 5: 
          localm.hbS = locala.vHC.readString();
          return 0;
        case 6: 
          localm.hbT = locala.vHC.rY();
          return 0;
        }
        localm.hbU = locala.vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/backup/h/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */