package com.tencent.mm.plugin.address.d;

public final class b
  extends com.tencent.mm.bk.a
{
  public String eXX;
  public String eXY;
  public String eXZ;
  public String eYa;
  public String eYb;
  public String eYc;
  public String eYd;
  public String eYe;
  public String eYf;
  public int id;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.id);
      if (this.eXX != null) {
        paramVarArgs.g(2, this.eXX);
      }
      if (this.eXY != null) {
        paramVarArgs.g(3, this.eXY);
      }
      if (this.eXZ != null) {
        paramVarArgs.g(4, this.eXZ);
      }
      if (this.eYa != null) {
        paramVarArgs.g(5, this.eYa);
      }
      if (this.eYb != null) {
        paramVarArgs.g(6, this.eYb);
      }
      if (this.eYc != null) {
        paramVarArgs.g(7, this.eYc);
      }
      if (this.eYd != null) {
        paramVarArgs.g(8, this.eYd);
      }
      if (this.eYe != null) {
        paramVarArgs.g(9, this.eYe);
      }
      if (this.eYf != null) {
        paramVarArgs.g(10, this.eYf);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.id) + 0;
      paramInt = i;
      if (this.eXX != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.eXX);
      }
      i = paramInt;
      if (this.eXY != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.eXY);
      }
      paramInt = i;
      if (this.eXZ != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.eXZ);
      }
      i = paramInt;
      if (this.eYa != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.eYa);
      }
      paramInt = i;
      if (this.eYb != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.eYb);
      }
      i = paramInt;
      if (this.eYc != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.eYc);
      }
      paramInt = i;
      if (this.eYd != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.eYd);
      }
      i = paramInt;
      if (this.eYe != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.eYe);
      }
      paramInt = i;
    } while (this.eYf == null);
    return i + f.a.a.b.b.a.h(10, this.eYf);
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
        localb.id = locala.vHC.rY();
        return 0;
      case 2: 
        localb.eXX = locala.vHC.readString();
        return 0;
      case 3: 
        localb.eXY = locala.vHC.readString();
        return 0;
      case 4: 
        localb.eXZ = locala.vHC.readString();
        return 0;
      case 5: 
        localb.eYa = locala.vHC.readString();
        return 0;
      case 6: 
        localb.eYb = locala.vHC.readString();
        return 0;
      case 7: 
        localb.eYc = locala.vHC.readString();
        return 0;
      case 8: 
        localb.eYd = locala.vHC.readString();
        return 0;
      case 9: 
        localb.eYe = locala.vHC.readString();
        return 0;
      }
      localb.eYf = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/address/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */