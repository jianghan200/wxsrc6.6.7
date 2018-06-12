package com.tencent.mm.plugin.wallet.a;

public final class n
  extends com.tencent.mm.bk.a
{
  public String desc;
  public String dzE;
  public String id;
  public String name;
  public String pdR;
  public String peu;
  public String pev;
  public String pew = "0";
  public String pex = "0";
  public int pey = 0;
  public int pez;
  public int status;
  public int type;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.id != null) {
        paramVarArgs.g(1, this.id);
      }
      if (this.name != null) {
        paramVarArgs.g(2, this.name);
      }
      if (this.desc != null) {
        paramVarArgs.g(3, this.desc);
      }
      paramVarArgs.fT(4, this.status);
      if (this.url != null) {
        paramVarArgs.g(5, this.url);
      }
      paramVarArgs.fT(6, this.type);
      if (this.peu != null) {
        paramVarArgs.g(7, this.peu);
      }
      if (this.pev != null) {
        paramVarArgs.g(8, this.pev);
      }
      if (this.pew != null) {
        paramVarArgs.g(9, this.pew);
      }
      if (this.pex != null) {
        paramVarArgs.g(10, this.pex);
      }
      paramVarArgs.fT(11, this.pey);
      if (this.pdR != null) {
        paramVarArgs.g(12, this.pdR);
      }
      if (this.dzE != null) {
        paramVarArgs.g(13, this.dzE);
      }
      paramVarArgs.fT(14, this.pez);
      return 0;
    }
    if (paramInt == 1) {
      if (this.id == null) {
        break label846;
      }
    }
    label846:
    for (int i = f.a.a.b.b.a.h(1, this.id) + 0;; i = 0)
    {
      paramInt = i;
      if (this.name != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.name);
      }
      i = paramInt;
      if (this.desc != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.desc);
      }
      i += f.a.a.a.fQ(4, this.status);
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.url);
      }
      i = paramInt + f.a.a.a.fQ(6, this.type);
      paramInt = i;
      if (this.peu != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.peu);
      }
      i = paramInt;
      if (this.pev != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.pev);
      }
      paramInt = i;
      if (this.pew != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.pew);
      }
      i = paramInt;
      if (this.pex != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.pex);
      }
      i += f.a.a.a.fQ(11, this.pey);
      paramInt = i;
      if (this.pdR != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.pdR);
      }
      i = paramInt;
      if (this.dzE != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.dzE);
      }
      return i + f.a.a.a.fQ(14, this.pez);
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
        n localn = (n)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localn.id = locala.vHC.readString();
          return 0;
        case 2: 
          localn.name = locala.vHC.readString();
          return 0;
        case 3: 
          localn.desc = locala.vHC.readString();
          return 0;
        case 4: 
          localn.status = locala.vHC.rY();
          return 0;
        case 5: 
          localn.url = locala.vHC.readString();
          return 0;
        case 6: 
          localn.type = locala.vHC.rY();
          return 0;
        case 7: 
          localn.peu = locala.vHC.readString();
          return 0;
        case 8: 
          localn.pev = locala.vHC.readString();
          return 0;
        case 9: 
          localn.pew = locala.vHC.readString();
          return 0;
        case 10: 
          localn.pex = locala.vHC.readString();
          return 0;
        case 11: 
          localn.pey = locala.vHC.rY();
          return 0;
        case 12: 
          localn.pdR = locala.vHC.readString();
          return 0;
        case 13: 
          localn.dzE = locala.vHC.readString();
          return 0;
        }
        localn.pez = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */