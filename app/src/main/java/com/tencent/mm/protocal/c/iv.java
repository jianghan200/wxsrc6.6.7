package com.tencent.mm.protocal.c;

public final class iv
  extends com.tencent.mm.bk.a
{
  public String bPS;
  public int rka;
  public int rkb;
  public String rkc;
  public int rkd;
  public String rke;
  public int rkf;
  public int rkg;
  public int rkh;
  public String rki;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bPS != null) {
        paramVarArgs.g(1, this.bPS);
      }
      paramVarArgs.fT(2, this.rka);
      paramVarArgs.fT(3, this.rkb);
      if (this.rkc != null) {
        paramVarArgs.g(4, this.rkc);
      }
      paramVarArgs.fT(5, this.rkd);
      if (this.rke != null) {
        paramVarArgs.g(6, this.rke);
      }
      paramVarArgs.fT(7, this.rkf);
      paramVarArgs.fT(8, this.rkg);
      paramVarArgs.fT(9, this.rkh);
      if (this.rki != null) {
        paramVarArgs.g(10, this.rki);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bPS == null) {
        break label582;
      }
    }
    label582:
    for (paramInt = f.a.a.b.b.a.h(1, this.bPS) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rka) + f.a.a.a.fQ(3, this.rkb);
      paramInt = i;
      if (this.rkc != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rkc);
      }
      i = paramInt + f.a.a.a.fQ(5, this.rkd);
      paramInt = i;
      if (this.rke != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rke);
      }
      i = paramInt + f.a.a.a.fQ(7, this.rkf) + f.a.a.a.fQ(8, this.rkg) + f.a.a.a.fQ(9, this.rkh);
      paramInt = i;
      if (this.rki != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rki);
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
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        iv localiv = (iv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localiv.bPS = locala.vHC.readString();
          return 0;
        case 2: 
          localiv.rka = locala.vHC.rY();
          return 0;
        case 3: 
          localiv.rkb = locala.vHC.rY();
          return 0;
        case 4: 
          localiv.rkc = locala.vHC.readString();
          return 0;
        case 5: 
          localiv.rkd = locala.vHC.rY();
          return 0;
        case 6: 
          localiv.rke = locala.vHC.readString();
          return 0;
        case 7: 
          localiv.rkf = locala.vHC.rY();
          return 0;
        case 8: 
          localiv.rkg = locala.vHC.rY();
          return 0;
        case 9: 
          localiv.rkh = locala.vHC.rY();
          return 0;
        }
        localiv.rki = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/iv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */