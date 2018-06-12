package com.tencent.mm.protocal.c;

public final class azi
  extends com.tencent.mm.bk.a
{
  public String bSc;
  public String bWP;
  public String poH;
  public String ppQ;
  public long pqc;
  public long pqd;
  public long pqe;
  public int pqf;
  public int pqg;
  public long pqh;
  public String pwk;
  public String sbX;
  public String sbY;
  public String sbZ;
  public int sca;
  public String title;
  public String type;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.url != null) {
        paramVarArgs.g(1, this.url);
      }
      if (this.bSc != null) {
        paramVarArgs.g(2, this.bSc);
      }
      if (this.bWP != null) {
        paramVarArgs.g(3, this.bWP);
      }
      if (this.pwk != null) {
        paramVarArgs.g(4, this.pwk);
      }
      if (this.ppQ != null) {
        paramVarArgs.g(5, this.ppQ);
      }
      if (this.sbX != null) {
        paramVarArgs.g(6, this.sbX);
      }
      if (this.type != null) {
        paramVarArgs.g(7, this.type);
      }
      if (this.title != null) {
        paramVarArgs.g(8, this.title);
      }
      paramVarArgs.T(9, this.pqc);
      paramVarArgs.T(10, this.pqd);
      if (this.poH != null) {
        paramVarArgs.g(11, this.poH);
      }
      paramVarArgs.T(12, this.pqe);
      paramVarArgs.fT(13, this.pqf);
      paramVarArgs.fT(14, this.pqg);
      if (this.sbY != null) {
        paramVarArgs.g(15, this.sbY);
      }
      if (this.sbZ != null) {
        paramVarArgs.g(16, this.sbZ);
      }
      paramVarArgs.T(17, this.pqh);
      paramVarArgs.fT(18, this.sca);
      return 0;
    }
    if (paramInt == 1) {
      if (this.url == null) {
        break label1018;
      }
    }
    label1018:
    for (int i = f.a.a.b.b.a.h(1, this.url) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bSc != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bSc);
      }
      i = paramInt;
      if (this.bWP != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bWP);
      }
      paramInt = i;
      if (this.pwk != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.pwk);
      }
      i = paramInt;
      if (this.ppQ != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.ppQ);
      }
      paramInt = i;
      if (this.sbX != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.sbX);
      }
      i = paramInt;
      if (this.type != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.type);
      }
      paramInt = i;
      if (this.title != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.title);
      }
      i = paramInt + f.a.a.a.S(9, this.pqc) + f.a.a.a.S(10, this.pqd);
      paramInt = i;
      if (this.poH != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.poH);
      }
      i = paramInt + f.a.a.a.S(12, this.pqe) + f.a.a.a.fQ(13, this.pqf) + f.a.a.a.fQ(14, this.pqg);
      paramInt = i;
      if (this.sbY != null) {
        paramInt = i + f.a.a.b.b.a.h(15, this.sbY);
      }
      i = paramInt;
      if (this.sbZ != null) {
        i = paramInt + f.a.a.b.b.a.h(16, this.sbZ);
      }
      return i + f.a.a.a.S(17, this.pqh) + f.a.a.a.fQ(18, this.sca);
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
        azi localazi = (azi)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localazi.url = locala.vHC.readString();
          return 0;
        case 2: 
          localazi.bSc = locala.vHC.readString();
          return 0;
        case 3: 
          localazi.bWP = locala.vHC.readString();
          return 0;
        case 4: 
          localazi.pwk = locala.vHC.readString();
          return 0;
        case 5: 
          localazi.ppQ = locala.vHC.readString();
          return 0;
        case 6: 
          localazi.sbX = locala.vHC.readString();
          return 0;
        case 7: 
          localazi.type = locala.vHC.readString();
          return 0;
        case 8: 
          localazi.title = locala.vHC.readString();
          return 0;
        case 9: 
          localazi.pqc = locala.vHC.rZ();
          return 0;
        case 10: 
          localazi.pqd = locala.vHC.rZ();
          return 0;
        case 11: 
          localazi.poH = locala.vHC.readString();
          return 0;
        case 12: 
          localazi.pqe = locala.vHC.rZ();
          return 0;
        case 13: 
          localazi.pqf = locala.vHC.rY();
          return 0;
        case 14: 
          localazi.pqg = locala.vHC.rY();
          return 0;
        case 15: 
          localazi.sbY = locala.vHC.readString();
          return 0;
        case 16: 
          localazi.sbZ = locala.vHC.readString();
          return 0;
        case 17: 
          localazi.pqh = locala.vHC.rZ();
          return 0;
        }
        localazi.sca = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/azi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */