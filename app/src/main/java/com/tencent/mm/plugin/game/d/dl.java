package com.tencent.mm.plugin.game.d;

import f.a.a.b;

public final class dl
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public String jPA;
  public String jPG;
  public String jQb;
  public String jSv;
  public String jTx;
  public int jTy;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jQb == null) {
        throw new b("Not all required fields were included: AppId");
      }
      if (this.jQb != null) {
        paramVarArgs.g(1, this.jQb);
      }
      if (this.jSv != null) {
        paramVarArgs.g(2, this.jSv);
      }
      if (this.jPG != null) {
        paramVarArgs.g(3, this.jPG);
      }
      if (this.hbL != null) {
        paramVarArgs.g(4, this.hbL);
      }
      if (this.jTx != null) {
        paramVarArgs.g(5, this.jTx);
      }
      paramVarArgs.fT(6, this.jTy);
      if (this.jPA != null) {
        paramVarArgs.g(7, this.jPA);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jQb == null) {
        break label529;
      }
    }
    label529:
    for (int i = f.a.a.b.b.a.h(1, this.jQb) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jSv != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jSv);
      }
      i = paramInt;
      if (this.jPG != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jPG);
      }
      paramInt = i;
      if (this.hbL != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.hbL);
      }
      i = paramInt;
      if (this.jTx != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jTx);
      }
      i += f.a.a.a.fQ(6, this.jTy);
      paramInt = i;
      if (this.jPA != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.jPA);
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
        if (this.jQb != null) {
          break;
        }
        throw new b("Not all required fields were included: AppId");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        dl localdl = (dl)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localdl.jQb = locala.vHC.readString();
          return 0;
        case 2: 
          localdl.jSv = locala.vHC.readString();
          return 0;
        case 3: 
          localdl.jPG = locala.vHC.readString();
          return 0;
        case 4: 
          localdl.hbL = locala.vHC.readString();
          return 0;
        case 5: 
          localdl.jTx = locala.vHC.readString();
          return 0;
        case 6: 
          localdl.jTy = locala.vHC.rY();
          return 0;
        }
        localdl.jPA = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/d/dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */