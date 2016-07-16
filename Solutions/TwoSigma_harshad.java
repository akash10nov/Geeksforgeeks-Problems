while (rightWindow < s.length())
    {
        if (w <= k)
        {
            if (s.charAt(rightWindow) == 'W')
              w++;
            rightWindow++;
        }
        if (w > k)
        {
            if (s.charAt(leftWindow) == 'W')
              w--;
            leftWindow++;
        }
        if (rightWindow-leftWindow > bestWindow)
        {
            bestWindow = ightWindow-leftWindow 
            bestL = leftWindow;
        }
    }
    for (int i=0; i<bestWindow; i++)
    {
        if (s.charAt(bestL+i) == 'W')
            System.out.print((bestL+i)+" ")
    }
}