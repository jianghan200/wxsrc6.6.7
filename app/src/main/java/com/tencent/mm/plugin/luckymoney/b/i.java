package com.tencent.mm.plugin.luckymoney.b;

public final class i
  extends com.tencent.mm.bk.a
{
  public String kLZ;
  public int kPI;
  public String kPM;
  public long kPP;
  public long kPR;
  public String kPS;
  public int kQd;
  public String kQo;
  public long kQp;
  public String kQq;
  public String kQr;
  public String kQs;
  public long kQt;
  public int kQu;
  public int status;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.kQo != null) {
        paramVarArgs.g(1, this.kQo);
      }
      if (this.kPM != null) {
        paramVarArgs.g(2, this.kPM);
      }
      paramVarArgs.T(3, this.kQp);
      if (this.kQq != null) {
        paramVarArgs.g(4, this.kQq);
      }
      paramVarArgs.fT(5, this.kPI);
      if (this.kQr != null) {
        paramVarArgs.g(6, this.kQr);
      }
      if (this.kQs != null) {
        paramVarArgs.g(7, this.kQs);
      }
      paramVarArgs.T(8, this.kPR);
      paramVarArgs.T(9, this.kQt);
      paramVarArgs.T(10, this.kPP);
      paramVarArgs.fT(11, this.status);
      paramVarArgs.fT(12, this.kQu);
      if (this.kPS != null) {
        paramVarArgs.g(13, this.kPS);
      }
      if (this.kLZ != null) {
        paramVarArgs.g(14, this.kLZ);
      }
      paramVarArgs.fT(15, this.kQd);
      return 0;
    }
    if (paramInt == 1) {
      if (this.kQo == null) {
        break label829;
      }
    }
    label829:
    for (paramInt = f.a.a.b.b.a.h(1, this.kQo) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.kPM != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.kPM);
      }
      i += f.a.a.a.S(3, this.kQp);
      paramInt = i;
      if (this.kQq != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.kQq);
      }
      i = paramInt + f.a.a.a.fQ(5, this.kPI);
      paramInt = i;
      if (this.kQr != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.kQr);
      }
      i = paramInt;
      if (this.kQs != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.kQs);
      }
      i = i + f.a.a.a.S(8, this.kPR) + f.a.a.a.S(9, this.kQt) + f.a.a.a.S(10, this.kPP) + f.a.a.a.fQ(11, this.status) + f.a.a.a.fQ(12, this.kQu);
      paramInt = i;
      if (this.kPS != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.kPS);
      }
      i = paramInt;
      if (this.kLZ != null) {
        i = paramInt + f.a.a.b.b.a.h(14, this.kLZ);
      }
      return i + f.a.a.a.fQ(15, this.kQd);
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
        i locali = (i)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          locali.kQo = locala.vHC.readString();
          return 0;
        case 2: 
          locali.kPM = locala.vHC.readString();
          return 0;
        case 3: 
          locali.kQp = locala.vHC.rZ();
          return 0;
        case 4: 
          locali.kQq = locala.vHC.readString();
          return 0;
        case 5: 
          locali.kPI = locala.vHC.rY();
          return 0;
        case 6: 
          locali.kQr = locala.vHC.readString();
          return 0;
        case 7: 
          locali.kQs = locala.vHC.readString();
          return 0;
        case 8: 
          locali.kPR = locala.vHC.rZ();
          return 0;
        case 9: 
          locali.kQt = locala.vHC.rZ();
          return 0;
        case 10: 
          locali.kPP = locala.vHC.rZ();
          return 0;
        case 11: 
          locali.status = locala.vHC.rY();
          return 0;
        case 12: 
          locali.kQu = locala.vHC.rY();
          return 0;
        case 13: 
          locali.kPS = locala.vHC.readString();
          return 0;
        case 14: 
          locali.kLZ = locala.vHC.readString();
          return 0;
        }
        locali.kQd = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */