package com.tencent.mm.protocal.c;

public final class axj
  extends com.tencent.mm.bk.a
{
  public String jPc;
  public int jPj;
  public String jPy;
  public String jSv;
  public String rbh;
  public String rbj;
  public String ris;
  public int riv;
  public String sas;
  public String sat;
  public String sau;
  public String sav;
  public String saw;
  public String sax;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPc != null) {
        paramVarArgs.g(1, this.jPc);
      }
      if (this.jSv != null) {
        paramVarArgs.g(2, this.jSv);
      }
      if (this.sas != null) {
        paramVarArgs.g(3, this.sas);
      }
      if (this.rbh != null) {
        paramVarArgs.g(4, this.rbh);
      }
      if (this.jPy != null) {
        paramVarArgs.g(5, this.jPy);
      }
      paramVarArgs.fT(6, this.riv);
      if (this.sat != null) {
        paramVarArgs.g(7, this.sat);
      }
      if (this.rbj != null) {
        paramVarArgs.g(8, this.rbj);
      }
      if (this.ris != null) {
        paramVarArgs.g(9, this.ris);
      }
      if (this.sau != null) {
        paramVarArgs.g(10, this.sau);
      }
      if (this.sav != null) {
        paramVarArgs.g(11, this.sav);
      }
      if (this.saw != null) {
        paramVarArgs.g(12, this.saw);
      }
      if (this.sax != null) {
        paramVarArgs.g(13, this.sax);
      }
      paramVarArgs.fT(14, this.jPj);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPc == null) {
        break label878;
      }
    }
    label878:
    for (int i = f.a.a.b.b.a.h(1, this.jPc) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jSv != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jSv);
      }
      i = paramInt;
      if (this.sas != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.sas);
      }
      paramInt = i;
      if (this.rbh != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rbh);
      }
      i = paramInt;
      if (this.jPy != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jPy);
      }
      i += f.a.a.a.fQ(6, this.riv);
      paramInt = i;
      if (this.sat != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.sat);
      }
      i = paramInt;
      if (this.rbj != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.rbj);
      }
      paramInt = i;
      if (this.ris != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.ris);
      }
      i = paramInt;
      if (this.sau != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.sau);
      }
      paramInt = i;
      if (this.sav != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.sav);
      }
      i = paramInt;
      if (this.saw != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.saw);
      }
      paramInt = i;
      if (this.sax != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.sax);
      }
      return paramInt + f.a.a.a.fQ(14, this.jPj);
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
        axj localaxj = (axj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localaxj.jPc = locala.vHC.readString();
          return 0;
        case 2: 
          localaxj.jSv = locala.vHC.readString();
          return 0;
        case 3: 
          localaxj.sas = locala.vHC.readString();
          return 0;
        case 4: 
          localaxj.rbh = locala.vHC.readString();
          return 0;
        case 5: 
          localaxj.jPy = locala.vHC.readString();
          return 0;
        case 6: 
          localaxj.riv = locala.vHC.rY();
          return 0;
        case 7: 
          localaxj.sat = locala.vHC.readString();
          return 0;
        case 8: 
          localaxj.rbj = locala.vHC.readString();
          return 0;
        case 9: 
          localaxj.ris = locala.vHC.readString();
          return 0;
        case 10: 
          localaxj.sau = locala.vHC.readString();
          return 0;
        case 11: 
          localaxj.sav = locala.vHC.readString();
          return 0;
        case 12: 
          localaxj.saw = locala.vHC.readString();
          return 0;
        case 13: 
          localaxj.sax = locala.vHC.readString();
          return 0;
        }
        localaxj.jPj = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/axj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */