package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class bsx
  extends com.tencent.mm.bk.a
{
  public String bIr;
  public String bxD;
  public int gsu;
  public String kcL;
  public String knh;
  public String knj;
  public String knk;
  public String knl;
  public String sqp;
  public String sqq;
  public String title;
  public int versionCode;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.knj == null) {
        throw new b("Not all required fields were included: patchId");
      }
      if (this.knk == null) {
        throw new b("Not all required fields were included: newApkMd5");
      }
      if (this.knl == null) {
        throw new b("Not all required fields were included: oldApkMd5");
      }
      if (this.title == null) {
        throw new b("Not all required fields were included: title");
      }
      if (this.sqq == null) {
        throw new b("Not all required fields were included: okBtn");
      }
      if (this.kcL == null) {
        throw new b("Not all required fields were included: cancelBtn");
      }
      if (this.bxD == null) {
        throw new b("Not all required fields were included: patchMd5");
      }
      if (this.knj != null) {
        paramVarArgs.g(1, this.knj);
      }
      if (this.sqp != null) {
        paramVarArgs.g(2, this.sqp);
      }
      paramVarArgs.fT(3, this.gsu);
      if (this.knk != null) {
        paramVarArgs.g(4, this.knk);
      }
      if (this.knl != null) {
        paramVarArgs.g(5, this.knl);
      }
      if (this.title != null) {
        paramVarArgs.g(6, this.title);
      }
      if (this.bIr != null) {
        paramVarArgs.g(7, this.bIr);
      }
      if (this.sqq != null) {
        paramVarArgs.g(8, this.sqq);
      }
      if (this.kcL != null) {
        paramVarArgs.g(9, this.kcL);
      }
      if (this.knh != null) {
        paramVarArgs.g(10, this.knh);
      }
      if (this.bxD != null) {
        paramVarArgs.g(11, this.bxD);
      }
      paramVarArgs.fT(12, this.versionCode);
      return 0;
    }
    if (paramInt == 1) {
      if (this.knj == null) {
        break label1000;
      }
    }
    label1000:
    for (paramInt = f.a.a.b.b.a.h(1, this.knj) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.sqp != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.sqp);
      }
      i += f.a.a.a.fQ(3, this.gsu);
      paramInt = i;
      if (this.knk != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.knk);
      }
      i = paramInt;
      if (this.knl != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.knl);
      }
      paramInt = i;
      if (this.title != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.title);
      }
      i = paramInt;
      if (this.bIr != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.bIr);
      }
      paramInt = i;
      if (this.sqq != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.sqq);
      }
      i = paramInt;
      if (this.kcL != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.kcL);
      }
      paramInt = i;
      if (this.knh != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.knh);
      }
      i = paramInt;
      if (this.bxD != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.bxD);
      }
      return i + f.a.a.a.fQ(12, this.versionCode);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.knj == null) {
          throw new b("Not all required fields were included: patchId");
        }
        if (this.knk == null) {
          throw new b("Not all required fields were included: newApkMd5");
        }
        if (this.knl == null) {
          throw new b("Not all required fields were included: oldApkMd5");
        }
        if (this.title == null) {
          throw new b("Not all required fields were included: title");
        }
        if (this.sqq == null) {
          throw new b("Not all required fields were included: okBtn");
        }
        if (this.kcL == null) {
          throw new b("Not all required fields were included: cancelBtn");
        }
        if (this.bxD != null) {
          break;
        }
        throw new b("Not all required fields were included: patchMd5");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        bsx localbsx = (bsx)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbsx.knj = locala.vHC.readString();
          return 0;
        case 2: 
          localbsx.sqp = locala.vHC.readString();
          return 0;
        case 3: 
          localbsx.gsu = locala.vHC.rY();
          return 0;
        case 4: 
          localbsx.knk = locala.vHC.readString();
          return 0;
        case 5: 
          localbsx.knl = locala.vHC.readString();
          return 0;
        case 6: 
          localbsx.title = locala.vHC.readString();
          return 0;
        case 7: 
          localbsx.bIr = locala.vHC.readString();
          return 0;
        case 8: 
          localbsx.sqq = locala.vHC.readString();
          return 0;
        case 9: 
          localbsx.kcL = locala.vHC.readString();
          return 0;
        case 10: 
          localbsx.knh = locala.vHC.readString();
          return 0;
        case 11: 
          localbsx.bxD = locala.vHC.readString();
          return 0;
        }
        localbsx.versionCode = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bsx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */