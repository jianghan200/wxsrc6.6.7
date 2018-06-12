package com.tencent.mm.plugin.q.a;

public final class b
  extends com.tencent.mm.bk.a
{
  public String csD;
  public int knA;
  public String knB;
  public String knC;
  public String knD;
  public String knE;
  public String knF;
  public String knG;
  public String knH;
  public String knI;
  public String knJ;
  public String title;
  public String type;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.knA);
      if (this.type != null) {
        paramVarArgs.g(2, this.type);
      }
      if (this.title != null) {
        paramVarArgs.g(3, this.title);
      }
      if (this.knB != null) {
        paramVarArgs.g(4, this.knB);
      }
      if (this.knC != null) {
        paramVarArgs.g(5, this.knC);
      }
      if (this.knD != null) {
        paramVarArgs.g(6, this.knD);
      }
      if (this.knE != null) {
        paramVarArgs.g(7, this.knE);
      }
      if (this.knF != null) {
        paramVarArgs.g(8, this.knF);
      }
      if (this.knG != null) {
        paramVarArgs.g(9, this.knG);
      }
      if (this.knH != null) {
        paramVarArgs.g(10, this.knH);
      }
      if (this.csD != null) {
        paramVarArgs.g(11, this.csD);
      }
      if (this.knI != null) {
        paramVarArgs.g(12, this.knI);
      }
      if (this.knJ != null) {
        paramVarArgs.g(13, this.knJ);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.knA) + 0;
      paramInt = i;
      if (this.type != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.type);
      }
      i = paramInt;
      if (this.title != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.title);
      }
      paramInt = i;
      if (this.knB != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.knB);
      }
      i = paramInt;
      if (this.knC != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.knC);
      }
      paramInt = i;
      if (this.knD != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.knD);
      }
      i = paramInt;
      if (this.knE != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.knE);
      }
      paramInt = i;
      if (this.knF != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.knF);
      }
      i = paramInt;
      if (this.knG != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.knG);
      }
      paramInt = i;
      if (this.knH != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.knH);
      }
      i = paramInt;
      if (this.csD != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.csD);
      }
      paramInt = i;
      if (this.knI != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.knI);
      }
      i = paramInt;
    } while (this.knJ == null);
    return paramInt + f.a.a.b.b.a.h(13, this.knJ);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      b localb = (b)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localb.knA = locala.vHC.rY();
        return 0;
      case 2: 
        localb.type = locala.vHC.readString();
        return 0;
      case 3: 
        localb.title = locala.vHC.readString();
        return 0;
      case 4: 
        localb.knB = locala.vHC.readString();
        return 0;
      case 5: 
        localb.knC = locala.vHC.readString();
        return 0;
      case 6: 
        localb.knD = locala.vHC.readString();
        return 0;
      case 7: 
        localb.knE = locala.vHC.readString();
        return 0;
      case 8: 
        localb.knF = locala.vHC.readString();
        return 0;
      case 9: 
        localb.knG = locala.vHC.readString();
        return 0;
      case 10: 
        localb.knH = locala.vHC.readString();
        return 0;
      case 11: 
        localb.csD = locala.vHC.readString();
        return 0;
      case 12: 
        localb.knI = locala.vHC.readString();
        return 0;
      }
      localb.knJ = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/q/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */