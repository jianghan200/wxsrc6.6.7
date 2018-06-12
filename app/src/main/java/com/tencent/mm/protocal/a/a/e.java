package com.tencent.mm.protocal.a.a;

import java.util.LinkedList;

public final class e
  extends com.tencent.mm.bk.a
{
  public int nettype;
  public int qXh;
  public LinkedList<d> qXi = new LinkedList();
  public String qXr;
  public String qXs;
  public String qXt;
  public String qXu;
  public String qXv;
  public int qXw;
  public int uin;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.uin);
      paramVarArgs.fT(2, this.qXh);
      paramVarArgs.fT(3, this.nettype);
      paramVarArgs.d(4, 8, this.qXi);
      if (this.qXr != null) {
        paramVarArgs.g(5, this.qXr);
      }
      if (this.qXs != null) {
        paramVarArgs.g(6, this.qXs);
      }
      if (this.qXt != null) {
        paramVarArgs.g(7, this.qXt);
      }
      if (this.qXu != null) {
        paramVarArgs.g(8, this.qXu);
      }
      if (this.qXv != null) {
        paramVarArgs.g(9, this.qXv);
      }
      paramVarArgs.fT(10, this.qXw);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.uin) + 0 + f.a.a.a.fQ(2, this.qXh) + f.a.a.a.fQ(3, this.nettype) + f.a.a.a.c(4, 8, this.qXi);
      paramInt = i;
      if (this.qXr != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.qXr);
      }
      i = paramInt;
      if (this.qXs != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.qXs);
      }
      paramInt = i;
      if (this.qXt != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.qXt);
      }
      i = paramInt;
      if (this.qXu != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.qXu);
      }
      paramInt = i;
      if (this.qXv != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.qXv);
      }
      return paramInt + f.a.a.a.fQ(10, this.qXw);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.qXi.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      e locale = (e)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        locale.uin = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        locale.qXh = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        locale.nettype = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new d();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((d)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          locale.qXi.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 5: 
        locale.qXr = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 6: 
        locale.qXs = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 7: 
        locale.qXt = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 8: 
        locale.qXu = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 9: 
        locale.qXv = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      locale.qXw = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */