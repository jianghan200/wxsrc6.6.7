package com.tencent.mm.plugin.game.d;

public final class cy
  extends com.tencent.mm.bk.a
{
  public String jOX;
  public String jPd;
  public String jTm;
  public String jTn;
  public String jTo;
  public boolean jTp;
  public boolean jTq;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPd != null) {
        paramVarArgs.g(1, this.jPd);
      }
      if (this.jTm != null) {
        paramVarArgs.g(2, this.jTm);
      }
      if (this.jTn != null) {
        paramVarArgs.g(3, this.jTn);
      }
      if (this.jTo != null) {
        paramVarArgs.g(4, this.jTo);
      }
      if (this.jOX != null) {
        paramVarArgs.g(5, this.jOX);
      }
      paramVarArgs.av(6, this.jTp);
      paramVarArgs.av(7, this.jTq);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPd == null) {
        break label467;
      }
    }
    label467:
    for (int i = f.a.a.b.b.a.h(1, this.jPd) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jTm != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jTm);
      }
      i = paramInt;
      if (this.jTn != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jTn);
      }
      paramInt = i;
      if (this.jTo != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jTo);
      }
      i = paramInt;
      if (this.jOX != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jOX);
      }
      return i + (f.a.a.b.b.a.ec(6) + 1) + (f.a.a.b.b.a.ec(7) + 1);
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
        cy localcy = (cy)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcy.jPd = locala.vHC.readString();
          return 0;
        case 2: 
          localcy.jTm = locala.vHC.readString();
          return 0;
        case 3: 
          localcy.jTn = locala.vHC.readString();
          return 0;
        case 4: 
          localcy.jTo = locala.vHC.readString();
          return 0;
        case 5: 
          localcy.jOX = locala.vHC.readString();
          return 0;
        case 6: 
          localcy.jTp = locala.cJQ();
          return 0;
        }
        localcy.jTq = locala.cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/d/cy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */