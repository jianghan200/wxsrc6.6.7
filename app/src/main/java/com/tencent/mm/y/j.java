package com.tencent.mm.y;

import java.util.LinkedList;

public class j
  extends com.tencent.mm.bk.a
{
  public String bZG;
  public String bZH;
  public String cGB;
  public LinkedList<m> dzs = new LinkedList();
  public int dzt;
  public String name;
  public int type;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.type);
      if (this.name != null) {
        paramVarArgs.g(2, this.name);
      }
      if (this.bZG != null) {
        paramVarArgs.g(3, this.bZG);
      }
      if (this.bZH != null) {
        paramVarArgs.g(4, this.bZH);
      }
      if (this.cGB != null) {
        paramVarArgs.g(5, this.cGB);
      }
      paramVarArgs.d(6, 8, this.dzs);
      paramVarArgs.fT(7, this.dzt);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.type) + 0;
      paramInt = i;
      if (this.name != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.name);
      }
      i = paramInt;
      if (this.bZG != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bZG);
      }
      paramInt = i;
      if (this.bZH != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.bZH);
      }
      i = paramInt;
      if (this.cGB != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.cGB);
      }
      return i + f.a.a.a.c(6, 8, this.dzs) + f.a.a.a.fQ(7, this.dzt);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.dzs.clear();
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
      j localj = (j)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localj.type = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localj.name = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        localj.bZG = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 4: 
        localj.bZH = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 5: 
        localj.cGB = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 6: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new m();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((m)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localj.dzs.add(localObject1);
          paramInt += 1;
        }
        return 0;
      }
      localj.dzt = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/y/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */