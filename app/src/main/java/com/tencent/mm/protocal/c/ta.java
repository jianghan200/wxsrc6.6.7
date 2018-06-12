package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class ta
  extends com.tencent.mm.bk.a
{
  public String jPK;
  public String lPl;
  public String rem;
  public String rwk;
  public String rwl;
  public String rwm;
  public String rwn;
  public String rwo;
  public String rwp;
  public String rwq;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rwk == null) {
        throw new b("Not all required fields were included: Md5");
      }
      if (this.rwk != null) {
        paramVarArgs.g(1, this.rwk);
      }
      if (this.jPK != null) {
        paramVarArgs.g(2, this.jPK);
      }
      if (this.lPl != null) {
        paramVarArgs.g(3, this.lPl);
      }
      if (this.rwl != null) {
        paramVarArgs.g(4, this.rwl);
      }
      if (this.rwm != null) {
        paramVarArgs.g(5, this.rwm);
      }
      if (this.rwn != null) {
        paramVarArgs.g(6, this.rwn);
      }
      if (this.rem != null) {
        paramVarArgs.g(7, this.rem);
      }
      if (this.rwo != null) {
        paramVarArgs.g(8, this.rwo);
      }
      if (this.rwp != null) {
        paramVarArgs.g(9, this.rwp);
      }
      if (this.rwq != null) {
        paramVarArgs.g(10, this.rwq);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rwk == null) {
        break label718;
      }
    }
    label718:
    for (int i = f.a.a.b.b.a.h(1, this.rwk) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jPK != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPK);
      }
      i = paramInt;
      if (this.lPl != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.lPl);
      }
      paramInt = i;
      if (this.rwl != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rwl);
      }
      i = paramInt;
      if (this.rwm != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rwm);
      }
      paramInt = i;
      if (this.rwn != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rwn);
      }
      i = paramInt;
      if (this.rem != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rem);
      }
      paramInt = i;
      if (this.rwo != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rwo);
      }
      i = paramInt;
      if (this.rwp != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rwp);
      }
      paramInt = i;
      if (this.rwq != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rwq);
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
        if (this.rwk != null) {
          break;
        }
        throw new b("Not all required fields were included: Md5");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        ta localta = (ta)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localta.rwk = locala.vHC.readString();
          return 0;
        case 2: 
          localta.jPK = locala.vHC.readString();
          return 0;
        case 3: 
          localta.lPl = locala.vHC.readString();
          return 0;
        case 4: 
          localta.rwl = locala.vHC.readString();
          return 0;
        case 5: 
          localta.rwm = locala.vHC.readString();
          return 0;
        case 6: 
          localta.rwn = locala.vHC.readString();
          return 0;
        case 7: 
          localta.rem = locala.vHC.readString();
          return 0;
        case 8: 
          localta.rwo = locala.vHC.readString();
          return 0;
        case 9: 
          localta.rwp = locala.vHC.readString();
          return 0;
        }
        localta.rwq = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */