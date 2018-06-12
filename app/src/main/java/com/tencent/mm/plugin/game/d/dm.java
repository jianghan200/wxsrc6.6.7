package com.tencent.mm.plugin.game.d;

public final class dm
  extends com.tencent.mm.bk.a
{
  public String jPS;
  public String jTA;
  public String jTB;
  public String jTC;
  public int jTD;
  public String jTE;
  public String jTF;
  public String jTz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPS != null) {
        paramVarArgs.g(1, this.jPS);
      }
      if (this.jTz != null) {
        paramVarArgs.g(2, this.jTz);
      }
      if (this.jTA != null) {
        paramVarArgs.g(3, this.jTA);
      }
      if (this.jTB != null) {
        paramVarArgs.g(4, this.jTB);
      }
      if (this.jTC != null) {
        paramVarArgs.g(5, this.jTC);
      }
      paramVarArgs.fT(6, this.jTD);
      if (this.jTE != null) {
        paramVarArgs.g(7, this.jTE);
      }
      if (this.jTF != null) {
        paramVarArgs.g(8, this.jTF);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPS == null) {
        break label552;
      }
    }
    label552:
    for (int i = f.a.a.b.b.a.h(1, this.jPS) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jTz != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jTz);
      }
      i = paramInt;
      if (this.jTA != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jTA);
      }
      paramInt = i;
      if (this.jTB != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jTB);
      }
      i = paramInt;
      if (this.jTC != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jTC);
      }
      i += f.a.a.a.fQ(6, this.jTD);
      paramInt = i;
      if (this.jTE != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.jTE);
      }
      i = paramInt;
      if (this.jTF != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.jTF);
      }
      return i;
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
        dm localdm = (dm)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localdm.jPS = locala.vHC.readString();
          return 0;
        case 2: 
          localdm.jTz = locala.vHC.readString();
          return 0;
        case 3: 
          localdm.jTA = locala.vHC.readString();
          return 0;
        case 4: 
          localdm.jTB = locala.vHC.readString();
          return 0;
        case 5: 
          localdm.jTC = locala.vHC.readString();
          return 0;
        case 6: 
          localdm.jTD = locala.vHC.rY();
          return 0;
        case 7: 
          localdm.jTE = locala.vHC.readString();
          return 0;
        }
        localdm.jTF = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/d/dm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */